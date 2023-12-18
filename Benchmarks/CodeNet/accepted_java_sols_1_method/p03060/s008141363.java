import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] v = new int[N];
		for(int i = 0; i < N ; i++) {
			v[i] = sc.nextInt();
		}

		int[] c = new int[N];
		for(int i = 0; i < N ; i++) {
			c[i] = sc.nextInt();
		}

		sc.close();

		int answer = 0;

		for(int i = 0 ; i < N ;i ++) {
			if(v[i] > c[i]) {
				answer += v[i] -c[i];
			}
		}

		System.out.println(answer);
	}

}
