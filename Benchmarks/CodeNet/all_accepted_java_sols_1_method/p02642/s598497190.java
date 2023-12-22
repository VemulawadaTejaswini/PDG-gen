import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		boolean[] A = new boolean[1000001];
		int a;
		int ans = 0;
		ArrayList<Integer> rep = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			a = scan.nextInt();
			if (A[a]) {
				rep.add(a);
			}
			A[a] = true;
		}

		for (int i = 1; i < 1000001; i++) {
			if (A[i]) {
				for (int j = 2; i*j < 1000001; j++) {
					A[i*j] = false;
				}
			}
		}

		for (int i = 0; i < rep.size(); i++) {
			A[rep.get(i)] = false;
		}

		for (int i = 1; i < 1000001; i++) {
			if(A[i]) ans++;
		}

		System.out.println(ans);

	}

}