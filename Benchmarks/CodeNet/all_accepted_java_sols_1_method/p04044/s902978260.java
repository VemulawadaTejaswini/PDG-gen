import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int l = stdIn.nextInt();
		
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = stdIn.next();
		}
		
		Arrays.sort(s);
		
		for(int i = 0; i < n; i++) {
			System.out.print(s[i]);
		}
		
	}

}
