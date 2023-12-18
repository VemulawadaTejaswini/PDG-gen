import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		// r<=x<=(W-r) && r<=y<=(H-r)
		Scanner sc = new Scanner(System.in);
		int x, y, r, w, h;
		w = sc.nextInt();
		h = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		r = sc.nextInt();
		if (x >= r && x <= (w - r) && y >= r && y <= (h - r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
