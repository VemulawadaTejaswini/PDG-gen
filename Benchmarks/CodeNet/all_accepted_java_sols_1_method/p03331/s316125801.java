import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 100000;
		for (int i = 1; i < N / 2 + 1; i++) {
			String I = String.valueOf(i);
			String J = String.valueOf(N - i);
			int temp = 0;
			int jj = 0;
			for (int j = 0; j < J.length(); j++) {
				temp += Integer.parseInt(J.substring(j, j + 1));
			}
			for (int k = 0; k < I.length(); k++) {
				temp += Integer.parseInt(I.substring(k, k + 1));
			}
			if(ans>temp) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}
}