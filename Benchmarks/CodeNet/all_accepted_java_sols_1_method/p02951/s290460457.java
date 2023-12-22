import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// A, B, Cの入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 結果の出力
		System.out.println(C-(A-B) > 0 ? C-(A-B) : 0);
		
		sc.close();
	}
}
