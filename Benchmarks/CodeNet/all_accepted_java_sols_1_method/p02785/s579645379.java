import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] H = new int[N];
		int i = 0;
		while(i < N) {
			H[i] = sc.nextInt();
			i++;
		}

		Arrays.sort(H);
		Long sum = (long) 0;

		for(i = 0;i < N-K; i++) {
			sum += H[i];
		}


		System.out.println(sum);
	}

}
