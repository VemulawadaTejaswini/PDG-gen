import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		String answer = "NG";
		for(int i = A;i <= B; i++) {
			if(i % K == 0) {
				answer = "OK";
				break;
			}
		}
		System.out.println(answer);

	}

}
