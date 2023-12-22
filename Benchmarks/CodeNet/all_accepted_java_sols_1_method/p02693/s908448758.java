import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int K = sc.nextInt();
		// スペース区切りの整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();

		for(int i = 1; i <= B; i++) {
			if(K*i < A) {
				continue;
			} else if(K*i > B) {
				System.out.println("NG");
				break;
			} else {
				System.out.println("OK");
				break;
			}
		}
	}
}
