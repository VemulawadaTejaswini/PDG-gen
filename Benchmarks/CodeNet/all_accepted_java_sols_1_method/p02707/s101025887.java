import java.util.HashMap;
import java.util.Scanner;


public class Main{
	

	
	
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i=1;i<n;i++) {
			int c = s.nextInt();
			if(h.containsKey(c)) {
				h.put(c, h.get(c)+1);
			}
			else {
				h.put(c, 1);
			}
		}
		for(int i=1;i<=n;i++) {
			if(h.containsKey(i))
				System.out.println(h.get(i));
			else {
				System.out.println(0);
			}
		}
		
	}
}