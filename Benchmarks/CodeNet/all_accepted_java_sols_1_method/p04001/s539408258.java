import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int[] a = new int[n];

		for(int i = 0;i < n; i++) {
			a[i] = s.charAt(i) - '0';
		}


		long ans = 0;

		for (int bit = 0; bit < 1 << (n-1); bit++){

			long num = 0;
			long sum = 0;

			for (int j = 0; j < n; j++){

				num = num * 10 + a[j];

				if ((bit >> j & 1) == 1){
					sum += num;
					num = 0;
				}

			}

			sum += num;
			ans += sum;

		}

		System.out.println(ans);

	}

}
