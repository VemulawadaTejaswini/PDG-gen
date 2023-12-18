import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		int ans[] = {1, 0};
		int an = 1;
		if(2 * x == w && 2 * y == h)an = 0;
		double area = 0.0;
		area = (double)h * (double)w / 2.0;
		System.out.println(area + " " + ans[an]);
	}
}
