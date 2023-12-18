import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if(N <= 1){

			System.out.println(1);
			return;

		}

		long table[] = new long[N+1];

		table[0] = 1;
		table[1] = 1;

		for(int i = 2; i <= N; i++){
			table[i] = table[i-1]+table[i-2];
		}

		System.out.println(table[N]);
	}
}

