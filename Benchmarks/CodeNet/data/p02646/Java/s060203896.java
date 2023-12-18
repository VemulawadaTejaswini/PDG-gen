import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long V = sc.nextLong();
		long B = sc.nextLong();
		long W = sc.nextLong();
		long T = sc.nextLong();

		boolean catched = false;

		if (V <= W) {
			catched = false;
		} else if ((V - W) >= Math.abs(A - B) / T) {
			catched = true;
		}



		if (catched) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}