import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];

		for(int i=1;i<=N;i++) {
			a[i] = sc.nextInt();
		}

		int i=1;

		int push = 0;
		for(int j=0;j<N;j++) {
			if(i == 2) {
				System.out.println(push);
				return;
			}else {
				push++;
				i = a[i];
			}
		}
		System.out.println(-1);
	}

}
