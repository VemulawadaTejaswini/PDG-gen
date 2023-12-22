import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		LinkedHashMap<String, Long> map = new LinkedHashMap<String, Long>();
		long max = 0;
		for (int i=0;i<N;i++) {
			String S = sc.next();
		    if (map.containsKey(S)) {
		        map.put(S, map.get(S) + 1);
		        if(max<map.get(S)) {
		        	max = map.get(S);
		        }
		    } else {
		        map.put(S, (long) 1);
		        if(max<1) {
		        	max=1;
		        }
		    }
		}
		ArrayList<String> s = new ArrayList<String>();
		for(String S :map.keySet()) {
			if(map.get(S)==max) {
				s.add(S);
			}
		}
		Collections.sort(s);
		for(String x : s) {
			System.out.println(x);
		}
	}
}