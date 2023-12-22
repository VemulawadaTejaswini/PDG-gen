import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean judje = true;

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int sum = 0;

		if( K < A)
			sum += K;
		else
			sum += A;

		K -= (A + B);

		if( K > 0){
			sum -= K;
		}
		System.out.println(sum);
	}

}
