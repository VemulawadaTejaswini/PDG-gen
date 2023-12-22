import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int gu = N*(N-1)/2;
		int ki = M*(M-1)/2;
		
		System.out.println(gu + ki);
	}
}