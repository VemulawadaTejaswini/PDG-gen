import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int W = sc.nextInt(); int H = sc.nextInt(); int x = sc.nextInt(); int y = sc.nextInt(); int r = sc.nextInt();
		if ((r<=x&&x<=W-r) && (r<=y&&y<=H-r)) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		
	}
}
