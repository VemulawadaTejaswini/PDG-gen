import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		final int INF = 300000;
		int[] num = new int[INF];
		for(int i = 1; i < INF; i++) {
			num[i] = i;
		}

		boolean[] isPrime = new boolean[INF];
		for(int a = 0; a < INF; a++)	isPrime[a] = true;
		//	2の倍数は除外
		for(int a = 2; a < INF; a += 2) {
			isPrime[a] = false;
		}
		isPrime[1] = isPrime[0] = false;
		isPrime[2] = true;
		//	3からforで判別を始める
		for(int i = 3; i < INF; i += 2) {
			for(int j = 2; j < INF / i; j++) {
				isPrime[(i*j)] = false;
			}
		}

		int input = -1;
		while(true){
			int count = 0;
			input = src.nextInt();
			if(input == 0)	break;
			for(int a = input + 1; a <= (input * 2); a++) {
				if(isPrime[a])	count++;
			}
			System.out.println(count);
		}
	}
}

