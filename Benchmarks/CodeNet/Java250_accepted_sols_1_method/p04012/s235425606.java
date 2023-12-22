import java.util.*;
import java.util.Map.Entry;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for (int i=0;i<w.length();i++) {
			if(hm.containsKey(w.charAt(i))) {
                  hm.put(w.charAt(i), hm.get(w.charAt(i))+1);}
              else { hm.put(w.charAt(i), 1);}}
		
		boolean flag = true;
		for (Entry<Character, Integer> entry : hm.entrySet()) {
            int value = entry.getValue(); 
            char key = entry.getKey(); 
            if (value%2!=0) {
            	flag = false;
            	break;}}
            
            if (flag) {
            	System.out.println("Yes");}
            else {
            	System.out.println("No");}
            }
		}
	

