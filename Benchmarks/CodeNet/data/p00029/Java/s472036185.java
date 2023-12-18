import java.util.*;
import java.util.Map.Entry;

public class EnglishSentence{
	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> map = new HashMap<String, Integer>();
	
	// main\bh----------------------------------------------------------------
	public static void main(String[] args){
		read();
		solve();
	}
	
	
	// read\bh-----------------------------------------------------------------
	static boolean read() {
		//±±ÅüÍðÇÝÞ
		while(sc.hasNext()){
			String str = sc.next();
			
			if(map.containsKey(str)){
				int i = map.get(str);
				i++;
				map.put(str, i);
			} else{
				map.put(str, 1);
			}
		}
		
		return true;
	}
	
	
	// solve\bh------------------------------------------------------
	static void solve() {
		//±±Åâèðð¢ÄoÍ·é
		int max = 0, max2 = 0;
		String maxKey = "\0", maxKey2 = "\0";
		
		
		//SGgÉANZX
		for(Entry<String, Integer> e : map.entrySet()){
			//Ååo»ñðT·
			if(max2 < e.getValue()){
				max2 = e.getValue();
				maxKey2 = e.getKey();
			}
			
			//Åå¶ðT·
			if (max < e.getKey().length()){
				max = e.getKey().length();
				maxKey = e.getKey();
			}
		}
		
		
		
		System.out.println(maxKey2 + " " + maxKey);
	}
}