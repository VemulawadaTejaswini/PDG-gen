import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long[] L = new long[N];
		for(int i=0; i<N; i++) {
			L[i] = sc.nextLong();
		}

		if(L.length < 3) {
			System.out.println(0);
			return;
		}

		long ans = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				if(L[j] == L[i])
					continue;
				for(int k=j+1; k<N; k++) {
					if(L[k] == L[j] || L[k] == L[i])
						continue;

					if(L[i] < L[j]+L[k] && L[i] > Math.abs(L[j]-L[k])) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);

	}


}
