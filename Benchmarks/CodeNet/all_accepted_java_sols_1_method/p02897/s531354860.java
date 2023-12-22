import java.util.*;
/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		double X = N*1.00000000;
		System.out.println((N-(N/2))/X);

		sc.close();
	}
};
