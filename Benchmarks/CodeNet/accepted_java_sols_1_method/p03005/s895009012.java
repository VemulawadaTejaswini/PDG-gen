import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if (K==1||N ==K) {
			System.out.println(0);
			return ;
		}
		System.out.println(N-K);
	}

}
