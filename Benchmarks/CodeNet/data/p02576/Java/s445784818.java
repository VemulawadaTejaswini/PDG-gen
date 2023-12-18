
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(), X= in.nextInt(), T = in.nextInt();
		
		int nt = (int) ((N * T)/(X * 100/100.0));
		int rs = (int) (nt + X / (T * 100/100.0));
		
		System.out.println(rs);

	}

}
