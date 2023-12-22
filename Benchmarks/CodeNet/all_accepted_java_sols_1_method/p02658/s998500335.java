import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		long sum = 1;
		boolean ch = false;
		long max = 1000000000000000000l;

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if(a[i] == 0) {
				System.out.println("0");
				return;
			}
		}

		for(int i = 0; i < n; i++) {
			if(max/sum < a[i]) {
				System.out.println("-1");
				return;
			}
			sum *= a[i];
			if(sum > max) {
				System.out.println("-1");
			}

		}
		System.out.println(sum);

	}

}
