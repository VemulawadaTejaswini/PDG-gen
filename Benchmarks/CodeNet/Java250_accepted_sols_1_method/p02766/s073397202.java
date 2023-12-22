import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int kurai = k;

		int answer = 1;

		while (kurai <= n) {
			answer++;
			kurai*= k;
		}
		System.out.println(answer);


	}
}