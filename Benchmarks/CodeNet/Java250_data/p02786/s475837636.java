import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		System.out.println(Main.count(N));
	}

	public static long count(long N) {
		if (N==0) {
			return 0;
		}
		return count(N/2)*2+1;
	}
}