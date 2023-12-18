import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		long result = 1L;
		for (int i = 0; i < a.length; i++) {
			if(result == 0) break;
			result *= a[i];
		}
		if(result > 1000000000000000000L){
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}
