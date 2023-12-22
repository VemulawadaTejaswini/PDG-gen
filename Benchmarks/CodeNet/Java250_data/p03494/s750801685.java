import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ABC_081_B
		Scanner sc = new Scanner(System.in);
		int ret = 0;

		int N = sc.nextInt();
		int[] A = new int[N];
		int i = 0;
		boolean flag = true;

		for(i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		while(flag) {
			for(i=0; i<N; i++) {
				if(A[i] % 2 == 1) {
					flag = false;
					break;
				} else {
					A[i] = A[i] / 2;
					if(i == N-1) {
						ret++;
					}
				}
			}
		}

		System.out.println(ret);
	}

}
