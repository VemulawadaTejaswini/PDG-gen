import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		
		int a = 0;
		
		if(0 <= x - r && x + r <= W) {
			if(0 <= y - r && y + r <= H) {
				a = 1;
			}
		}
		
		if(a == 1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
	}

}

