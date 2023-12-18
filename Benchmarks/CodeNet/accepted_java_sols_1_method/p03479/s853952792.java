import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong(), y = sc.nextLong();
		sc.close();
		long ans = 0;
		long n = y / x;
		int i = 0;
		while(true) {
			long tmp = (long)Math.pow(2,  i);
			if(tmp > n) {
				ans = i;
				break;
			}
			++i;
		}
		System.out.println(ans);
	}

}
