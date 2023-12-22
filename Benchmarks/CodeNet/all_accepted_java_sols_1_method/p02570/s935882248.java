import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int D = in.nextInt();
		
		int T = in.nextInt();
		int S = in.nextInt();
		
		if(D<= T * S) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
