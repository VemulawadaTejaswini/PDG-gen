
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int sum = 0;

		for(int i = 0; i < K; i++) {
			if(A > 0) {
				sum += 1;
				A -= 1;
				continue;
			}else if(B > 0) {
				sum += 0;
				B -= 1;
				continue;
			} else {
				sum -= 1;
				C -= 1;
				continue;
			}
		}
		System.out.println(sum);
	}

}
