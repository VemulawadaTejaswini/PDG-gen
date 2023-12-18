import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		int t = 0;
		int x = 0;
		int y = 0;
		boolean result = true;
		for(int n = 0 ; n < count ; n++) {
			int ti = sc.nextInt();
			int xi = sc.nextInt();
			int yi = sc.nextInt();
			int absX = Math.abs(xi -x);
			int absY = Math.abs(yi -y);
			int rest = (ti - t) - absX - absY;
			if(rest < 0 || rest%2 != 0) {
				result = false;
				break;
			} else {
				t = ti;
				x = xi;
				y = yi;
			}
		}
		if(result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}