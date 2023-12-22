import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] heights = new int[n+1];
			
			for(int i = 0 ; i < n ; i++) {
				heights[i] = sc.nextInt();
			}
			
			
			Map<Integer, HashSet<Integer>> pathMap = new HashMap<Integer, HashSet<Integer>>();

			
			for(int i = 0 ; i < m ; i++ ) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				
				if ( pathMap.containsKey(a)) {
					pathMap.get(a).add(b);
				}
				else {
					pathMap.put(a, new HashSet<Integer>());
					pathMap.get(a).add(b);
				}
				
				if ( pathMap.containsKey(b)) {
					pathMap.get(b).add(a);
				}
				else {
					pathMap.put(b, new HashSet<Integer>());
					pathMap.get(b).add(a);
				}
			}
			
			int total = 0;
			//
			for(int i = 0 ; i < n ; i++ ) {
				
				boolean isGood = true;

				if ( pathMap.containsKey(i)) {
					
					HashSet<Integer> pathSet = pathMap.get(i);
					
					for(int j : pathSet) {
						if ( heights[i] <= heights[j] ) {
							isGood = false;
							break;
						}	
					}					
				}
				
				if ( isGood )
					total++;
			}
			
			System.out.println(total);

		}
	}
}