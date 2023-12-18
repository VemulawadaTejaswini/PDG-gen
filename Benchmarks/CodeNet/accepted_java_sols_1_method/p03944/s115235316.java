import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		
		int l = 0;
		int r = w;
		int d = 0;
		int u = h;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			
			switch (a) {
			case 1:
				l = Math.max(l, x);
				break;
			case 2:
				r = Math.min(r, x);
				break;
			case 3:
				d = Math.max(d, y);
				break;
			case 4:
				u = Math.min(u, y);
				break;
			default:
				break;
			}
		}
		
		int area = Math.max(r - l, 0) * Math.max(u - d, 0);
		System.out.println(area);
		
		sc.close();
	}
}


