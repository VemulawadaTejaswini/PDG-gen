import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] H = new int[N];

		for(int i=0; i<H.length; i++) H[i] = sc.nextInt();

		boolean isOK = true;
		for(int i=N-1; i>0; i--) {
			int now = H[i];
			int next = H[i-1];

			H[i-1] = next-now == 1 ? next-1 : next;

			if(H[i-1]-now > 0) {
				isOK = false;
			}
		}

		System.out.println((isOK ? "Yes" : "No"));
		sc.close();
	}
}
