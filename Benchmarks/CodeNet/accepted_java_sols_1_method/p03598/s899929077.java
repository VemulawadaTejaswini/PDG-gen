import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int x= sc.nextInt();
			sum += 2* Math.min(x, K-x);
		}
		System.out.println(sum);
	}
}
