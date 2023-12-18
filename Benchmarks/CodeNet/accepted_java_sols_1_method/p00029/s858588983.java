import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main{
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		
		String words[] = br.readLine().split(" ");
		Map<String,Integer> dict = new HashMap<String,Integer>();
		String longest = "";
		
		for(int i = 0;i<words.length;i++){
			if(dict.containsKey(words[i])){
				dict.put(words[i],dict.get(words[i])+1);
			}else{
				dict.put(words[i],1);
			}
			if(words[i].length()>longest.length()){
				longest = words[i];
			}
		}
		
		int max = -1;
		String dict_max = "";
		
		for(String key : dict.keySet()){
			if(max<dict.get(key)){
				max = dict.get(key);
				dict_max = key;
			}
		}
		
		System.out.println(dict_max + " " + longest);
	}
}