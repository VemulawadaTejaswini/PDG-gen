import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int total = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int L = sc.nextInt();
			if(max < L) {
				max = L;
			}
			total += L;

		}

		total -= max;
		if(max < total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
