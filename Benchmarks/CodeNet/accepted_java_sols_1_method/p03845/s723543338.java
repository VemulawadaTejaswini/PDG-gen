import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] timevals = new int [n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			timevals[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int [] t = new int [m];
		int [] l = new int [m];
		for (int j = 0; j < m; j++) {
			t[j] = sc.nextInt();
			l[j] = sc.nextInt();
		}
		for(int k = 0; k < m; k++) {
			int p = t[k];
			int x = l[k];
			int sub = timevals[p - 1];
			timevals[p - 1] = x;
			for (int val : timevals) {
				count += val;
			}
			timevals[p - 1] = sub;
			System.out.println(count);
			count = 0;
		}
	}
}
