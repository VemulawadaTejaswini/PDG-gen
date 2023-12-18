import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO 172_C
			Scanner sc = new Scanner(System.in);

			int iCnt = 0;
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


			int b = 0;
			for(int a = 0; a < N+1; a++) {

				iCnt = 0;

				// Aからa冊読む
				if (K < lA[a]) {
					break;
				}

				// 残りをBから読めるだけ読む
				for(b = 0; b < M+1 ; b++) {
					if (K < lA[a] + lB[b]) {
						break;
					}
				}

				iCnt = a + b - 1;

				// 最大冊数を更新
				if (iMax < iCnt) {
					iMax = iCnt;
				}

			}

    		System.out.println(iMax);
    	}

    }