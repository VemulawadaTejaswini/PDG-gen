import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int Q = sc.nextInt();

		String S = sc.next();

		int[] a = new int[N];

		Arrays.fill(a, 0);

		for(int i=1;i<N;i++) {

			if(S.charAt(i-1)=='A' && S.charAt(i)=='C') {

				a[i] = a[i-1] + 1;

			}else {

				a[i] = a[i-1];
			}

		}

		for(int i=0;i<Q;i++) {

			int l = sc.nextInt();

			int r = sc.nextInt();

			System.out.println(a[r-1]-a[l-1]);
		}

	}

}
