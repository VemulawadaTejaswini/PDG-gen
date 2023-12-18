

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = Integer.parseInt(sc.next());
			int i, p, maxsum = 0, minsf = 0;
			int[] a = new int[5001];
			int[] S = new int[5001];
			if(n == 0) {
				break;
			}
			for(i = 0; i < n; i++) {
				a[i] = Integer.parseInt(sc.next());
			}
			S[0] =  a[0];
			for(i = 1; i < n; i++) {
				S[i] = S[i - 1] + a[i];
			}
			maxsum=a[0]; minsf=a[0];
			for(p = 1; p < n; p++){
				if(S[p] - minsf > maxsum) maxsum = S[p] - minsf;
				if(S[p] < minsf) minsf = S[p];
			}
			System.out.println(maxsum);
		}
		sc.close();


	}

}

