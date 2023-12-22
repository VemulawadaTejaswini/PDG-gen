import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int n = N;
		int count = 0;
		do {
			n = n / K;
			count++;
		}while(n != 0);

		System.out.println(count);
	}

}
