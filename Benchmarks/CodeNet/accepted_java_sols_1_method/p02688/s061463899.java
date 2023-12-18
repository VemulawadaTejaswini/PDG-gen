import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] num = new int[N];
		int[] d = new int[K];
		int[][] A = new int[K][N];

		int i = 0;

		while(i < N) {
			num[i] = 0;
			i++;
		}

		i = 0;
		while(i<K) {
			d[i] = sc.nextInt();
			for(int j = 0; j < d[i];j++) {
				A[i][j] = sc.nextInt();
				num[A[i][j]-1] += 1;
			}
			i++;
		}


		int counter = 0;
		for(i = 0 ; i < N ; i++ ) {
			if(num[i] == 0) {
				counter++;
			}

		}
		System.out.println(counter);
	}

}
