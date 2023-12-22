import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;
		int barray[] = new int [m];
		for(int i = 0;i<m;i++) {
			barray[i] = sc.nextInt();
		}
		int array[][] = new int [n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<n;i++) {
			int sum = 0;
			for(int j = 0;j<m;j++) {
				sum += array[i][j]*barray[j];
			}
			if(sum+c>0) res++;
		}
			System.out.println(res);
		sc.close();
	}
	public static void main(String[] args) {
		solve();

	}

}