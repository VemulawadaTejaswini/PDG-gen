import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[] b = new int[m];
		int count = 0;

		for (int i = 0;i<m ;i++ ) {
			b[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			int sum =0;
			for (int j = 0;j<m ;j++ ) {
				int	a = sc.nextInt();
				sum += b[j]*a;
			}

			if (sum+c>0) {
				count++;
			}
		}

		System.out.println(count);
	}
}
