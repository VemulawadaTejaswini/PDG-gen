import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int r = stdIn.nextInt();
		if (x<W && y<H && x>0 && y>0) {
			if (x+r<=W && y+r<=H && x-r>=0 && y-r>=0) {
				System.out.println("Yes");
				return;
			}
			System.out.println("No");
			return;
		}
		System.out.println("No");
	}
}