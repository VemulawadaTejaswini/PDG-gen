//Volume2-0225
import java.util.*;

class Cnt {
	public int cnt = 1;
}

public class Main {

	private static HashMap<Character,Cnt> map = new HashMap<Character,Cnt>();
	
	public static void main(String[] args) {

		//declare
		String ret;
		
    	//input
    	Scanner sc = new Scanner(System.in);
    	int n;
    	String s;
    	while((n = sc.nextInt()) != 0){
    		map.clear();
    		while(n-- > 0){
    			s = sc.next();
    			if(!s.isEmpty()){
    				keySet(s.charAt(0));
    				keySet(s.charAt(s.length()-1));
    			}
    		}
    		ret = "OK";
    		Iterator<Cnt> it = map.values().iterator();
    		while(it.hasNext()){
    			if((it.next()).cnt%2!=0){
    				ret = "NG";
    				break;
    			}
    		}
    		System.out.println(ret);
    	}
	}
	
	private static void keySet(char c){
		if(map.containsKey(c)){
			map.get(c).cnt++;
		} else {
			map.put(c,new Cnt());
		}
	}
}