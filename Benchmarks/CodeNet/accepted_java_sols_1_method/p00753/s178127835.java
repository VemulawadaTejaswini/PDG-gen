import java.util.Scanner;

/** AOJ_No.1172 ICPC_2011_A */
public class Main {
	public static final int DATA_MAX = 123456 * 2 + 1;

	public static void main(String[] args) {
		/* 素数表を作る */
		int[] primeNum = new int[DATA_MAX];/* 素数表(初期値:false) */
		for(int i = 2; i < DATA_MAX; i++) {
			/* 初期値なら素数 */
			if(primeNum[i] == 0) {
				primeNum[i] = 1;

				/* その素数の倍数を埋める */
				for(int j = i * 2; j < DATA_MAX; j += i) {
					primeNum[j] = 2;/* 非素数 */
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int count = 0, nn = n * 2;
			for(int i = n + 1; i <= nn; i++) {
				if(primeNum[i] == 1) count++;
			}
			System.out.println(count);
		}
	}
}

