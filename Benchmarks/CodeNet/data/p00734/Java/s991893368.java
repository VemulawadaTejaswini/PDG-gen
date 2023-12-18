import java.util.Scanner;


public class Main {
	static String[] a = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] b = new String[] {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) break;
			int[] sa = new int[n];
			int[] sb = new int[m];
			for(int i = 0; i < n; i++) {
				sa[i] = stdIn.nextInt();
			}
			for(int i = 0; i < m; i++) {
				sb[i] = stdIn.nextInt();
			}
			int ans = 9999999;
			int ansA = 0;
			int ansB = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					int[] tmpA = new int[n];
					int[] tmpB = new int[m];
					for(int k = 0; k < n; k++) {
						tmpA[k] = sa[k];
					}
					for(int k = 0; k < m; k++) {
						tmpB[k] = sb[k];
					}
					int anstmp = tmpA[i];
					anstmp += tmpB[j];
					int ansatmp = tmpA[i];
					int ansbtmp = tmpB[j];
					int tmp = tmpA[i];
					tmpA[i] = tmpB [j];
					tmpB[j] = tmp;
					int sumA = 0;
					int sumB = 0;
					for(int k = 0; k < n; k++) {
						sumA += tmpA[k];
					}
					for(int k = 0; k < m; k++) {
						sumB += tmpB[k];
					}
					if(sumA == sumB) {
						if(ans > anstmp) {
							ans = anstmp;
							ansA = ansatmp;
							ansB = ansbtmp;
						}
					}
				}
			}
			if(ans == 9999999) {
				System.out.println(-1);
			}
			else {
				System.out.println(ansA + " " + ansB);
			}
		}
		
	}
	
}