import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		long cal = 0;
		long[][] mt1 = new long[n][m];
		long[][] mt2 = new long[m][l];
		long[][] mt3 = new long[n][l];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mt1[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < l; j++) {
				mt2[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < l; j++) {
				for(int k = 0; k < m ; k++) {
					cal += mt1[i][k] * mt2[k][j];
				}
				mt3[i][j] = cal;
				cal = 0;
			}
		}

		 for(int i = 0; i < n ; i++) {
			 for(int j = 0; j < l; j++) {
				 if(j != l-1) {
					 System.out.print(mt3[i][j] + " ");
				 }else {
					 System.out.println(mt3[i][j]);
				 }
			 }
		 }
	}
}

