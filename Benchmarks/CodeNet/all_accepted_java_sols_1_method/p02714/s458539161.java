import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		
		char[] w = {'R', 'G', 'B'};

		int[][] sum = new int[N][3];
		for(int i=N-1; i>=0; i--) {
			for(int j=0; j<3; j++) {
				sum[i][j] = (i==N-1 ? 0 : sum[i+1][j]) + (s[i]==w[j] ? 1 : 0);
			}
		}
		
		long ans = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				if(s[i]!=s[j]) {
					if((s[i]^s[j])==('R'^'G')) {
						ans += sum[j+1][2];
						if(j+(j-i) < N && s[j+(j-i)]=='B')
							ans--;
					}
					if((s[i]^s[j])==('G'^'B')) {
						ans += sum[j+1][0];
						if(j+(j-i) < N && s[j+(j-i)]=='R')
							ans--;
					}
					if((s[i]^s[j])==('B'^'R')) {
						ans += sum[j+1][1];
						if(j+(j-i) < N && s[j+(j-i)]=='G')
							ans--;
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
