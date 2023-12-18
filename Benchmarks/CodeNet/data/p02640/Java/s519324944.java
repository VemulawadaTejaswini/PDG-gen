import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int p = x * 2;
		int q = x * 4;
		if (p <= y && q >= y && y % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}