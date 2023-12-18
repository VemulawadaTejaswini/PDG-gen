import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = Integer.parseInt(sc.nextLine());
			
			if(n == 0){
				break;
			}
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for(int i = 0; i < n; i++){
				String[] str = sc.nextLine().split(" ");
				
				for(String s : str){
					if(map.get(s) == null){
						map.put(s, 1);
					}else{
						map.put(s, map.remove(s) + 1);
					}
				}
			}
			
			String pur = sc.nextLine();
			
			int max = 0;
			ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(); 
			
			for(Map.Entry<String, Integer> elem : map.entrySet()){
				if(elem.getKey().startsWith(pur)){
					list.add(elem);
				}
			}
			
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

				@Override
				public int compare(Entry<String, Integer> o1,
						Entry<String, Integer> o2) {
					
					if(o2.getValue() - o1.getValue()  == 0){
						return o1.getKey().compareTo(o2.getKey());
					}
					
					return o2.getValue() - o1.getValue();
				}
				
			});
			
			if(list.size() == 0){
				System.out.println("NA");
			}else{
				boolean first = true;
				
				int count = 0;
				for(Map.Entry<String, Integer> elem : list){
					if(count >= 5){
						break;
					}
					
					
					if(first){
						first = false;
					}else{
						System.out.print(" ");
					}
					
					System.out.print(elem.getKey());
					count++;
				}
				
				System.out.println();
			}
		}
	}
}