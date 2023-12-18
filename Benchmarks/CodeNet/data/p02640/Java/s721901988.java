import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int p = y / 4;
		int q = y / 2;
		if (p <= x && q >= x) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}