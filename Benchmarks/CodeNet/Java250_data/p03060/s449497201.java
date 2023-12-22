import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] v = new int[N], c = new int[N];
		int sum = 0;

		for(int i = 0;i<N;i++)
			v[i] = sc.nextInt();

		for(int j = 0; j<N; j++)
			c[j] = sc.nextInt();

		for(int i = 0;i < N;i++) {
			int b = v[i] - c[i];
			if(b>0)
				sum+=b;
		}

		System.out.println(sum);
	}
}