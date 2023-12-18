import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();
		long sa = B-A;
		if (sa<0) {
			sa = -sa;
		}
		if (V<W) {
			System.out.println("NO");
			return ;
		}
		if (sa<=(V-W)*T) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
