import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ansL = 1;
		int ansR = N;

		for(int i = 0;i < M ; i++){
			ansL = Math.max(ansL,sc.nextInt());
			ansR = Math.min(ansR,sc.nextInt());
		}

		System.out.println(Math.max(0,ansR-ansL+1));
		sc.close();
	}
};
