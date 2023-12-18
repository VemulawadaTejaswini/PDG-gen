import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final long n = sc.nextLong();

			long t = 0;
			for(long i=1; i<=n; i++) {

				int c=0;
				for(int k=1; k<=i; k++) {
					if(i%k==0) {
						c++;
					}
				}
				t +=c*i;
			}

			System.out.println(t);
		}
	}
}