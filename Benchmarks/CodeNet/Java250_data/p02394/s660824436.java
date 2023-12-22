import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int mx = x-r;
		int Mx = x+r;
		int my = y-r;
		int My = y+r;
		if (mx >= 0 && Mx <= W && my >= 0 && My <= H) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}