import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int h, m, s;
		int S = stdIn.nextInt();
		
		while(S < 0 || S >= 86400) {
			S = stdIn.nextInt();
		}
		m = S / 60;
		h = m / 60;
		s = S - m * 60;
		m -= h * 60;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}

