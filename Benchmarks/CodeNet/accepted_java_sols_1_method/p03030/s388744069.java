import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		
		Map<String, Integer> rest = new TreeMap<String, Integer>();
		
		for(int i=1; i< N+1; i++){
			String s  = keyboard.next();
			int k  = keyboard.nextInt();
			rest.put(s+(200-k), i);
		}
		
        for(String key : rest.keySet()){
				System.out.println(rest.get(key));
			}
		keyboard.close();	
	}
}
