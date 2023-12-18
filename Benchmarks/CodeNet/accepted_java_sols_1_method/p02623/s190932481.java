import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO 172_C
			Scanner sc = new Scanner(System.in);

			int iMax = 0;

			int N = sc.nextInt();
			int M = sc.nextInt();
			long K = sc.nextLong();

			Long[] lA = new Long[N+1];
			Long[] lB = new Long[M+1];

			int i = 0;

			lA[0] = (long) 0;
			lB[0] = (long) 0;

			for(i=1; i<N+1; i++) {
					lA[i] = lA[i-1] + sc.nextLong();
			}
			for(i=1; i<M+1; i++) {
					lB[i] = lB[i-1] + sc.nextLong();
			}
			// Scannerクラスのインスタンスをクローズ
			sc.close();

			int b = M;
			while(lB[b] > K) {
				b--;
			}
			iMax = b;

			for(int a=1; a<=N; a++) {

				if(lA[a] > K) {
					break;
				}

				// Aからa冊読むとして
				// 残りをBから読めるだけ読む
				while(lA[a] + lB[b] > K) {
					b--;
				}

				// 最大冊数を更新
				if (iMax < a+b) {
					iMax = a+b;
				}

			}

    		System.out.println(iMax);
    	}
    }