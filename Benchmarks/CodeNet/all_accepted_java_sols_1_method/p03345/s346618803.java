import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		long ans = a - b;
		if (k % 2 != 0)
			ans *= -1;
		if (Math.abs(ans)>=(long)1000000000*1000000000)
			ans = 0;
		System.out.println(ans);
	}
}