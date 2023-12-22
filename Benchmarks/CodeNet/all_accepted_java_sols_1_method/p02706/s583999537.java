import java.util.Scanner;

public class Main {

	int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i=0;i<M;i++) {
			int a= sc.nextInt();
			N-=a;
		}
		if (N<0) {
			System.out.println(-1);
			return;
		}
		System.out.println(N);
	}

}