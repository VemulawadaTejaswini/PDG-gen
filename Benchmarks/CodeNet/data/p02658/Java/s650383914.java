import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();

			long ary[] = new long[n];

			for(int i =0;i < n;i++) {
				ary[i] = sc.nextLong();
			}

			Long sum = (long) 1;

			for(int i = 0; i < n; i++) {
				sum = sum * ary[i];
			}

			if(sum > Math.pow(10, 18)) {
				System.out.print("-1");
			}else {
				System.out.print(sum);
			}

		}
}

