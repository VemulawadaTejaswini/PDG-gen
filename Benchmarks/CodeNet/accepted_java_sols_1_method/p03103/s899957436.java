//2019/3/12
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int M = sc.nextInt();

		long[][] AB = new long[N][2];

		long A,B;

		for(int i=0;i<N;i++) {

				A = sc.nextLong();

				AB[i][0] = A;

				B = sc.nextLong();

				AB[i][1] = B;
		}

		Arrays.parallelSort(AB,(a,b) -> Long.compare(a[0],b[0]));

		long ans = 0;

		long x = 0;

		int index = 0;

		while(x<M) {

			if(x+AB[index][1]<=M) {

				ans += (AB[index][0]*AB[index][1]);

				x += AB[index][1];

			}else {

				for(int i=0;x<M;i++) {

					ans += AB[index][0];

					x++;

				}

			}

			index++;
		}

		System.out.println(ans);
	}

}
