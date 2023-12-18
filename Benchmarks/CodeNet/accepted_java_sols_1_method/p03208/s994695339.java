import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();


		int sum = 0;
		int min = 1000000001;

		int tree[] = new int[N];

		for(int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
		}


		Arrays.sort(tree);

		for(int i = 0; i < N - (K -1); i++) {
			if(min > tree[i + (K -1)] - tree[i]) {
				min = tree[i + (K -1)] - tree[i];
			}


		}



		System.out.println(min);



	}

}