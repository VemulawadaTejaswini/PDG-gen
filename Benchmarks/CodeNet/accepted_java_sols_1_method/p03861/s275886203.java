import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long ans = 0;

		if (a == 0) {
			ans = b/x+1;
		} else if (a%x == 0){
			ans = (b/x)-(a/x)+1;
		} else if (a%x != 0) {
			ans = (b/x)-(a/x);
		}
		System.out.println( ans );
	}
}