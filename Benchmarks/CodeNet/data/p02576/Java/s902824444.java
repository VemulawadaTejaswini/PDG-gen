import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(), X= in.nextInt(), T = in.nextInt();
		
		int nt = (N * T)/X;
		int rs = nt + X / T;
		
		System.out.println(rs);

	}

}
