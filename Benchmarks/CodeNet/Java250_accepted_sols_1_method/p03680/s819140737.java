import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}

		int k = a[0];
		int count = 0;

		while(k != 2 && count <= N) {
		k = a[k-1];
		count += 1;
		}

		if(k==2) {
			System.out.println(count + 1);
		}else {
			System.out.println(-1);
		}

	}

}
