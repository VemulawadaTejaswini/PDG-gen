import java.util.HashSet;
import java.util.Scanner;

public class Main {
	

	
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		HashSet<Integer> h = new HashSet<>();
		while(n--!=0) {
			h.add(s.nextInt());
		}
		
		int t=0;
		while(h.contains(x-t) && h.contains(x+t)) {
			t++;
		}
		
		if(!h.contains(x-t)) {
			System.out.println(x-t);
		}
		else if(!h.contains(x+t)) {
			System.out.println(x+t);
		}
	}
}