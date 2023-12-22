import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s;
		Map<String, Integer> poll = new TreeMap<String, Integer>();
		int max = 0;
		
		for(int i = 0; i < n; i++){
			s = scan.next();
			
			if(poll.containsKey(s)){
				poll.put(s, poll.get(s)+1);
			}
			else{
				poll.put(s, 1);
			}
		}
		
        for (String key : poll.keySet()) {
        	if(max < poll.get(key)){
        		max = poll.get(key);
        	}
		}
        
        Object[] mapkey = poll.keySet().toArray();
        Arrays.sort(mapkey);
        
        for (String key : poll.keySet()) {
        	if(poll.get(key)== max){
    			System.out.println(key);        		
        	}
		}
		
	}
}