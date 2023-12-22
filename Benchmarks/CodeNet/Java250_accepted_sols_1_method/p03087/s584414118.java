import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();

		int[] n = new int[N+1];
		n[0] = 0;
		for(int i=0; i<N; i++) {
			if(i+1 < N && S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
				n[i+1] = n[i];
				n[i+2] = n[i+1] + 1;
				i++;
			}else {
				n[i+1] = n[i];
			}
		}

		int[] ans = new int[Q];
		for(int i=0; i<Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			ans[i] = n[r]-n[l];
		}

		for(int i=0; i<Q; i++) {
			System.out.println(ans[i]);
		}
	}
}
