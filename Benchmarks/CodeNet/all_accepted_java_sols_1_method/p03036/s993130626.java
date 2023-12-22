import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long r = scan.nextLong();
		long d = scan.nextLong();
		long x = scan.nextLong();

		long[] ans = new long[11];
		ans[0] = r * x - d;
		int i;
		for(i = 1; i < 10; i++) {
			ans[i] = r * ans[i - 1] - d;
		}

		for(i = 0; i < 10; i++)
			System.out.println(ans[i]);
	}
}
