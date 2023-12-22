import java.util.HashSet;
import java.util.Scanner;

public class Main {
	

	
	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		HashSet<String> h = new HashSet<>();
		int n = s.nextInt();
		
		while(n--!=0) {
			h.add(s.next());
		}
		System.out.println(h.size());
		
		
	}
}