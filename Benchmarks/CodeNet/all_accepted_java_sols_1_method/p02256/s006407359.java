import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x!=y) {
			if(x>y) {
				x-=y;
			} else {
				y-=x;
			}
		}
		
		System.out.println(y);

	}
}
