import java.util.Scanner;
public class Main {
	long X;
	long K;
	long D;
	long ans = Long.MAX_VALUE;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		main.main(scan);
	}

	public void main(Scanner scan) {
		X = Long.parseLong(scan.next());
		K = Long.parseLong(scan.next());
		D = Long.parseLong(scan.next());
		scan.close();
		System.out.println(Walking());
	}

	public long Walking() {
		X = Math.abs(X);
		long k = Math.min(K,X/D);
		K -= k;
		X -= k*D;

		if (K % 2 == 0) {
			ans = X;
		} else {
			ans = Math.abs(X - D);
		}
		return ans;
	}

}
