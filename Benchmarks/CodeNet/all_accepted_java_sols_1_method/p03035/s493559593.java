import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int P = 0;
		if(A <= 5) {
			P = 0;
			System.out.println(P);
		}
		else if(A >= 6 && A <= 12) {
			P = B/2;
			System.out.println(P);
		}
		else {
			P = B;
			System.out.println(P);
		}

	}

}