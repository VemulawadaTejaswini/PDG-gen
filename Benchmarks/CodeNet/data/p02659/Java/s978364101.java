import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		String B = sc.next();
		sc.close();
		String[] bs_str = B.split("\\.");
		long ans = (A * Integer.parseInt(bs_str[0]+bs_str[1]))/100;
		System.out.println(ans);
	}
}
