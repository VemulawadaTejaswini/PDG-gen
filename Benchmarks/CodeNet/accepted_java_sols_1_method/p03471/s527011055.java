import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long Y = sc.nextLong();
		sc.close();
		int A = 0;int B = 0;int C = 0;
		for(int i = 0;i <= N;i++) {
			A = i * 10000;
			for(int j = 0;j <= N;j++) {
				B = j * 5000;
				C = (N - i - j) * 1000;
				if(A + B + C == Y && C >= 0) {
					System.out.println(i + " " + j + " " + (N - i - j));
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}