import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int K = sc.nextInt();


		long ans = 0;

		int m = 0;

		for(int i=1;i<=N;i++) {

			if(i%K==0) m++;

		}

		ans +=(long) Math.pow(m, 3);

		if(K%2==0) {

			int mm = 0;


			for(int i=1;i<=N;i++) {

				if(i%K==K/2) mm++;

			}



			ans += (long)Math.pow(mm, 3);
		}

		System.out.println(ans);

	}



}
