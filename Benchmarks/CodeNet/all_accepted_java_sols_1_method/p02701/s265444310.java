
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		Map <String , Integer> hm = new HashMap<String,Integer>();
		

		for(int i = 0 ; i < n ;i++) {
			String s = sc.next();
			if(hm.containsKey(s)){
				hm.put(s, 1+hm.get(s));
			}
			else {
				hm.put(s,1);
			}
		}
		
		System.out.println(hm.size());
	}

}
