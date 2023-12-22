import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if (x < -100 || y < -100 || x > 100 || y > 100 || W <= 0 || H <= 0 || r > 100) {
			System.out.println("Error!");
		}
		
		if ((x + r) > W || (x - r) < 0 || (y + r) > H || (y - r) < 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}