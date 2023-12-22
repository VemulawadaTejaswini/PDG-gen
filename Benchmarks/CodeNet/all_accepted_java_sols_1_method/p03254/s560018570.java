import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int x = sc.nextInt();

		int[] a = new int[N];

		for(int i=0;i<N;i++) {

			a[i] = sc.nextInt();
		}

		int temp = 0;

		for(int i=0;i<N-1;i++) {

			for(int j=i+1;j<N;j++) {

				if(a[i]>a[j]) {

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}
			}
		}

		int sum = 0;

		int k = 0;

		int ans = 0;

		while(sum <= x) {

			if(k>=a.length)break;

			sum += a[k];

			k++;

			ans ++;

		}
		if(sum == x) {
			System.out.println(ans);
		}else {
			System.out.println(ans-1);
		}
	}

}
