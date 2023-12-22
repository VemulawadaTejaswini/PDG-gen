
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Main {

	private static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			list.add(br.readLine());
		}
		br.close();
		
		Map<String,Integer> counted = count(list);
		outMaxVal(counted);
	}
	
	private static Map<String,Integer> count(List<String> list){
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String str:list) {
			if(!map.containsKey(str)) {
				map.put(str, 1);
			}else {
				map.put(str,map.get(str)+1);
			}
		}
		return map;
	}
	
	public static void outMaxVal(Map<String, Integer> map) {
		ArrayList<String> max = null;
		Integer maxVal = 0;
		for(Entry<String, Integer> e: map.entrySet()) {
			if(e.getValue().compareTo(maxVal)>0) {
				max = new ArrayList<String>();
				max.add(e.getKey());
				maxVal = e.getValue();
			}else if(e.getValue().equals(maxVal)) {
				max.add(e.getKey());
			}
		}
		Collections.sort(max);
		
		for(String str: max) {
			System.out.println(str);
		}
	}

}
