import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int n = (int)Math.sqrt(N)+1;
		for(int i = n; i > 0; i--) {
			long a = N/i;
			if(i*a == N) {
				System.out.println(i+a-2);
				break;
			}
		}
		sc.close();
	}
}