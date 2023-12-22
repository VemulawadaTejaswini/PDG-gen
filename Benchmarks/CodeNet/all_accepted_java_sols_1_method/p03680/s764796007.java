import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] button = new int[N];
		for(int i=0; i<N; i++) {
			button[i] = sc.nextInt();
		}

		int p = 0;
		for (int i = 0; i < N; i++ ) {
			int num = button[p];
			if(num == 2) {
				System.out.println(i+1);
				return;
			}
			p = num-1;
		}
		System.out.println(-1);
	}
}
