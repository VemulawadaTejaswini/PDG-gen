import java.util.Scanner;

public class Main {
	
	static int[] memo = new int[45];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (y > x) {
			int tmp = y;
			y = x;
			x = tmp;
		}
		
		while (y > 0) {
			int tmp = x%y;
			x = y;
			y = tmp;
		}
		
		System.out.println(x);
	}
}

