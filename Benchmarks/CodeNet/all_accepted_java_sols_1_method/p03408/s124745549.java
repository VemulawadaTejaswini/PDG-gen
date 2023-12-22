import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    TreeMap <String, Integer> s = new TreeMap <String, Integer>();
	    
	    String S = "";
	    for (int i = 0; i<N; i++){
			S = sc.next();
 
			if (s.containsKey(S)) 
				s.put(S, s.get(S) + 1);
			 else 
				s.put(S, 1);
		}
	    
	    TreeMap <String, Integer> t = new TreeMap <String, Integer>();
	    int M = sc.nextInt();
	    String T = "";
	    for (int i = 0; i<M; i++){
			T = sc.next();
 
			if (t.containsKey(T)) 
				t.put(T, t.get(T) + 1);
			 else 
				t.put(T, 1);
		}
	    
	    int max = 0;
	    while (s.isEmpty()==false) {
	    	String temp = s.firstKey();
	    	
	    	if (t.containsKey(temp)){
	    		max = Math.max(max, s.get(temp)-t.get(temp));
	    		s.pollFirstEntry();
	    	}
	    	else {
	    		max = Math.max(max, s.get(temp));
	    		s.pollFirstEntry();
	    	}
	    }
	    sc.close();
	    
	    System.out.println(max);
	}

}
