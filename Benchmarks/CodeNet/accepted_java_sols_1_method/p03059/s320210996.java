import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		double T = stdIn.nextInt();
		T = T + 0.5;
		
		int c = 0;
		for(; T >= A; T -= A) {
			c += B;
		}
		
		System.out.println(c);

	}

}