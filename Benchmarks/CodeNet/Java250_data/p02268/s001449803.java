import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] S = new long[n];

		for(int i = 0; i < n; i++) {
			S[i] = sc.nextLong();
		}

		int q = sc.nextInt();
		int count = 0;

		for(int j = 0; j < q; j++) {
			long T = sc.nextLong();
			for(int i = 0; i < n; i++) {
				if(T < S[i]) {
					break;
				} else if(T == S[i]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

}
