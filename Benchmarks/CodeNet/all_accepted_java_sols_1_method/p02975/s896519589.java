import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int xor_sum = 0;
		for ( int i = 0; i < n; i++ ) {
			xor_sum = xor_sum ^ in.nextInt();
		}
		
		if(xor_sum == 0) System.out.println("Yes");
		else System.out.println("No");
		
		in.close();
	}
}