import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			ArrayList<String> names = new ArrayList<String>();
			int[] prices = new int[n];
			for(int i = 0; i < n; i++){
				names.add(sc.next());
				prices[i] = sc.nextInt();
			}
			
			final int m = sc.nextInt();
			
			Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
			for(int i = 0; i < m; i++){
				final int from = names.indexOf(sc.next());
				
				final int num = sc.nextInt();
				
				HashSet<Integer> set = new HashSet<Integer>(num);
				for(int j = 0; j < num; j++){
					set.add(names.indexOf(sc.next()));
				}
				
				map.put(from, set);
			}
			
			boolean updated = false;
			for(int i = 0; i < m; i++){
				for(Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()){
					int sum = 0;
					for(int p : entry.getValue()){
						sum += prices[p];
					}
					
					if(prices[entry.getKey()] > sum){
						prices[entry.getKey()] = sum;
						updated = true;
					}
				}
				
				if(!updated){
					break;
				}else{
					updated = false;
				}
			}
			
			System.out.println(prices[names.indexOf(sc.next())]);
			
		}
		
	}

}