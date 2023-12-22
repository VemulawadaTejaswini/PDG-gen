import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] b = new int[N];
		for(int i=0; i<N; i++)
			b[i] = sc.nextInt();

		int[] ans = new int[N];
		for(int i=N; i>=1; i--) {
			int j=i-1;
			while(j>=0) {
				if(b[j]==j+1) {
					ans[i-1] = j+1;
					for(int k=j; k<i-1; k++) {
						b[k] = b[k+1];
					}
					break;
				}
				j--;
			}
			if(j<0) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}

		for(int i=0; i<N; i++)
			System.out.println(ans[i]);
		sc.close();
	}
}
