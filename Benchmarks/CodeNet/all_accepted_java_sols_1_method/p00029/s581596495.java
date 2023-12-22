import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(" ");
		
		int max_lenght = 0;
		String max_length_str = null;
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		while(sc.hasNext()){
			String str = sc.next();
			
			if(map.containsKey(str)){
				map.put(str,map.get(str).intValue() + 1);
			}else{
				map.put(str, 1);
			}
			
			if(max_lenght < str.length()){
				max_lenght = str.length();
				max_length_str = str;
			}
		}
		
		int max = 0;
		String max_str = null;
		for(String s:map.keySet()){
			if(map.get(s) > max){
				max = map.get(s);
				max_str = s;
			}
		}
		
		System.out.println(max_str + " " + max_length_str);
	}
}