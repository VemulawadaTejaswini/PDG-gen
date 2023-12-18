import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			int[]A = new int[N];
			Set<Integer>set = new TreeSet<Integer>();
			List<Integer>list = new ArrayList<Integer>();
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			
			

			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				set.add(A[i]);
				list.add(A[i]);
				map.put(A[i], 1);
			}
			
			Collections.sort(list);
			
			
			for(int i = 0;i<list.size();i++) {
				int num = list.get(i);
				int max = list.get(list.size()-1);
				
				if(i>=1&&list.get(i-1)==num) {
					map.put(num, 0);
					continue;
				}
				
				if(map.get(num)==0)continue;
				
				for(int j =2*num;j<=max;j =j+num) {
					//System.out.println(j);
					if(set.contains(j)) {
						if(map.get(j)==1) {
							//System.out.println("    "+j);
							map.put(j,0);
						}
						
					}
				}
				
				
			}
			
			int count = 0;
			
			
			for(Integer key: map.keySet()) {
				if(map.get(key)==1)count++;
			}
			
			
			System.out.println(count);
			
			
			
			
			
			
			
					
			
			
			
		}
		
		
	}
		

}
