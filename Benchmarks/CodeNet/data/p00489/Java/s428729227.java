import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		int a, b, c, d, n = Integer.valueOf(reader.readLine());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) map.put(i + 1, 0);
			
		for(int i = 0; i < n * (n - 1) / 2; i++){
			string = reader.readLine();
			a = Integer.valueOf(string.split(" ")[0]);
			b = Integer.valueOf(string.split(" ")[1]);
			c = Integer.valueOf(string.split(" ")[2]);
			d = Integer.valueOf(string.split(" ")[3]);
			
			if(c == d){
				map.put(a, map.get(a) + 1);
				map.put(b, map.get(b) + 1);
			}else if(c > d){
				map.put(a, map.get(a) + 3);
			}else{
				map.put(b, map.get(b) + 3);
			}
		}
		ArrayList<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
	 
			@Override
			public int compare(
					Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
				return ((Integer)entry2.getValue()).compareTo((Integer)entry1.getValue());
				}
			});
	        
	    for(Entry<Integer, Integer> var : entries) System.out.println(var.getKey());
	}
}