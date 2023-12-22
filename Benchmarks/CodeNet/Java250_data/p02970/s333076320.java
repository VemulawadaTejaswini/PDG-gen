import java.util.Scanner;
public class Main {

		static void solve() {
			Scanner sc = new Scanner(System.in);
			double n = sc.nextDouble();
			double d = sc.nextDouble();
			System.out.println((int)Math.ceil(n/(d*2+1)));
			sc.close();
		}
	public static void main(String[] args) {
	solve();

	}

}
