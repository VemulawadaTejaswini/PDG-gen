import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int nTotal = 0;
		int mTotal = 0;

		for (int i=1; i<n; i++){
			nTotal += i;
		}
		for (int i=1; i<m; i++){
			mTotal += i;
		}
		System.out.println(nTotal + mTotal);
	}
}