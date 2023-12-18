import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Map<String, Integer> m = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String in = sc.next();
			if(m.containsKey(in.toLowerCase())) {
				m.put(in.toLowerCase(), m.get(in.toLowerCase())+1);
			}else m.put(in.toLowerCase(), 1);
		}
		sc.close();
		
		List<String> result = findMode(m);
		List<String> words = new ArrayList<String>();
		for(Map.Entry<String, Integer> e: m.entrySet()) words.add(e.getKey());
		String longest = longestWord(words.toArray(new String[words.size()]));
		
		System.out.println(result.get(0) + " " + longest);
	}
	
	static <K> List<K> findMode(Map<K, Integer> map){
		List<K> result = new ArrayList<K>();
		int max_value = 0;
		for(Map.Entry<K, Integer> e: map.entrySet()) {
			if(e.getValue() > max_value) {
				result = new ArrayList<K>();
				result.add(e.getKey());
				max_value = e.getValue();
			}else if(e.getValue() == max_value) {
				result.add(e.getKey());
			}
		}
		return result;
	}
	
	static String longestWord(String... words) {
		int length = 0;
		String word = null;
		for(String s: words) {
			if(s.length() > length) {
				length = s.length();
				word = s;
			}
		}
		return word;
	}
}