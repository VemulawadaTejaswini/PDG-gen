import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int aMax=0;
		int bMax=0;
		int cMax=0;

		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for(int i=0;i<N;i++) {
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
			c[i] = scanner.nextInt();
		}

		aMax = a[0];
		bMax = b[0];
		cMax = c[0];

		for(int i=1;i<N;i++){
			//i-1のデータを退避させる．
			int aTemp = aMax;
			int bTemp = bMax;
			int cTemp = cMax;

			aMax = a[i] + Math.max(bTemp, cTemp);
			bMax = b[i] + Math.max(aTemp, cTemp);
			cMax = c[i] + Math.max(aTemp, bTemp);
//			System.out.println(i + "日目にaを選んだ時の最大幸せ指数:" + aMax);
//			System.out.println(i + "日目にbを選んだ時の最大幸せ指数:" + bMax);
//			System.out.println(i + "日目にcを選んだ時の最大幸せ指数:" + cMax);
		}

		//Math.max で最大値比較
		System.out.println(Math.max(aMax, Math.max(bMax, cMax)));
		scanner.close();
	}

}