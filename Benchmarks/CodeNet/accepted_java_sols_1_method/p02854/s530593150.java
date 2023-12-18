import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		long[] A = new long[N + 1];
		long LENG = 0;
		for(int i = 1;i <= N;i++) {
			A[i] = Long.parseLong(sc.next());
			LENG += A[i];
		}

		sc.close();

		long leng = 0;
		for(int i = 1;i <= N;i++) {
			leng += A[i];
			if(leng * 2 == LENG) {
				System.out.println(0);
				return;
			}
			if(leng * 2 > LENG) {
//				System.out.println(leng);
				long ans1 = leng - (LENG - leng);
//				System.out.println(leng - (LENG - leng));
				leng -= A[i];
//				System.out.println((LENG - leng) - leng);
				long ans2 = (LENG - leng) - leng;
				System.out.println(Math.min(ans1, ans2));


				break;
			}
		}



//		System.out.println(N);
//		for(int i = 1;i <= N;i++) {
//			System.out.print(a[i]);
//		}

//		FastScanner fs = new FastScanner();
//		int N = fs.nextInt();


	}
}

