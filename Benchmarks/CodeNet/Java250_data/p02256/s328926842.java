import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int x = scan.nextInt();
		int y = scan.nextInt();

		System.out.printf("%d\n", gcd(x, y));
	}

	public static int gcd(int x, int y){
		if(x < y){
			int work = y;
			y = x;
			x = work;
		}
		while(y > 0){
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}
}