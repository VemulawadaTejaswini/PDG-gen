import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long V = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long W = Long.parseLong(sc.next());
		long T = Long.parseLong(sc.next());
		sc.close();

		if(V > W) {
			long diff = V -W;
			long distance = Math.abs(B - A);
			long check = distance / diff;
			if(distance % diff == 0 && check <= T) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
	}
}