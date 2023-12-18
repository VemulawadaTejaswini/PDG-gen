import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str, s[];
		
		int n, q, max, c[];
		while(!(str = reader.readLine()).equals("0 0")){
			s = str.split(" ");
			n = Integer.valueOf(s[0]);
			q = Integer.valueOf(s[1]);
			
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i = 0; i < n; i++){
				s= reader.readLine().split(" ");
				c = new int[s.length];
				for(int j = 0; j < s.length; j++){ c[j] = Integer.valueOf(s[j]); }
				for(int j = 1; j <= c[0]; j++){
					if(map.containsKey(c[j])){
						map.put(c[j], map.get(c[j]) + 1);
					}else{
						map.put(c[j], 1);
					}
				}
			}
			max = 114514;
			for(Entry<Integer, Integer> var : map.entrySet()){
				if(var.getValue() == n && var.getKey() < max){
					max = var.getKey();
				}
			}
			if(max != 114514){
				System.out.println(max);
				continue;
			}
			for(Entry<Integer, Integer> var : map.entrySet()){
				if(var.getValue() >= q && var.getKey() < max){
					max = var.getKey();
				}
			}
			if(max != 114514){
				System.out.println(max);
			}else{
				System.out.println(0);
			}
		}
	}
}