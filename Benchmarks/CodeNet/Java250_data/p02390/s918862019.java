import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		Scanner scn = new Scanner(System.in);
		int S = scn.nextInt();
		int h = S/3600;
		int m = (S%3600)/60;
		int s = (S%3600)%60;
		System.out.println(h+":"+m+":"+s);
		scn.close();
	}

}