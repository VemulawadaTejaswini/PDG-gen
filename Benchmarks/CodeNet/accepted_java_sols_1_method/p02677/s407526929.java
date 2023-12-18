import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();
		scan.close();
		System.out.printf("%4.10f", Math.sqrt(A*A + B*B - 2 *A*B*Math.cos((H*30 - M*5.5) * Math.PI / 180)));
	}
}

