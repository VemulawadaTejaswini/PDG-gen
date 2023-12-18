import java.util.Scanner;

public class SumOfDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n+1];
		for(int i = 1; i <= n ; ++i) {
			for(int j = i; j <= n; j += i) {
				++arr[j];
			}
		}

		long ans = 0;
		for(int i = 1; i <= n; ++i) 
			ans += ( (long)i * arr[i]);

			System.out.println(ans);


	}
}
