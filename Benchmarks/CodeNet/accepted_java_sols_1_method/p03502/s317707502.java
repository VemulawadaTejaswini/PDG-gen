import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int sum = 0;
		int n = x;
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}

		String result = (x % sum == 0) ? "Yes" : "No";
		System.out.println(result);
	}

}