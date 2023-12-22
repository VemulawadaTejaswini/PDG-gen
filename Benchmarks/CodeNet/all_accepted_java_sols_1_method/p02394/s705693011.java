import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width = sc.nextInt();
		int height = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		int min_x = x - r;
		int min_y = y - r;
		int max_x = x + r;
		int max_y = y + r;
		
		if (min_x < 0 || min_y < 0 || max_x > width || max_y > height) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
