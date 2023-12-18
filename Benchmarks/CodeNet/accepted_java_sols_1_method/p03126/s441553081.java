import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[]k = new int[n];
		int[]a = new int[n*m];
		int[]A = new int[m];

		for(int i=0; i<n; i++) {
			k[i] = sc.nextInt();
				for(int j=0; j<k[i]; j++) {
					a[i] = sc.nextInt();
					A[a[i]-1]++;
				}
		}
		int cou = 0;
		for(int i=0; i<m; i++) {
			if(A[i]== n) {
				cou++;
			}
		}
		System.out.println(cou);
	}
}
