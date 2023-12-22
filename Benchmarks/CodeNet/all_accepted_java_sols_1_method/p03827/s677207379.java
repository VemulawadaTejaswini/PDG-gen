
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x = 0, max = x;
		String s;
		
		n = sc.nextInt();
		s = sc.next();
		
		sc.close();
		
		for(int i = 0; i < n; ++i) {
			if(s.charAt(i) == 'I')++x;
			else if(s.charAt(i) == 'D')--x;
			max = Math.max(max,  x);
		}
		
		System.out.println(max);
	}

}
