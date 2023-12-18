import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			TreeMap<Integer,HashSet<Integer>> map = new TreeMap<Integer,HashSet<Integer>>();
			
			for(int i=0;i<m;i++) {
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a<=b) {
					if(!map.containsKey(a)) {
						HashSet<Integer> list = new HashSet<Integer>();
						list.add(b);
						map.put(a, list);
					}else {
						if(!map.get(a).contains(b)) {
							map.get(a).add(b);
						}
					}
				}else {
					if(!map.containsKey(b)) {
						HashSet<Integer> list = new HashSet<Integer>();
						list.add(a);
						map.put(b, list);
					}else {
						if(!map.get(b).contains(a)) {
							map.get(b).add(a);
						}
					}
				}
				
				
				
				
			}
			
			//System.out.println(map);
			
			for(int i=1;i<=n;i++) {
				
				for(Map.Entry<Integer,HashSet<Integer>> e: map.entrySet()) {
					
					if(!map.containsKey(i)) {
						continue;
					}
					
					
					if(e.getValue().contains(i)){
						map.get(i).add(e.getKey());
					}
					
					
				}
			}
			
			int ret = 0;
			
			
			
			//System.out.println(map);
			
			for(Map.Entry<Integer,HashSet<Integer>> e: map.entrySet()) {
				ret = Math.max(ret, e.getValue().size());
			}
			
			System.out.println(ret+1);
	    }
		
	}
	
