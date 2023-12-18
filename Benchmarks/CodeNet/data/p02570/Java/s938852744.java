import java.util.Scanner;

public class Main {

	static boolean solve(int d, int t, int s) {
		
		if(s * t >= d)
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int d, t, s;
		d = stdIn.nextInt();
		t = stdIn.nextInt();
		s = stdIn.nextInt();
		boolean result = solve(d, t, s);
		if(result)
			System.out.println("Yes");
		else
			System.out.println("No");

		stdIn.close();
	}
}
