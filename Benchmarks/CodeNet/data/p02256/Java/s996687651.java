import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int temp = 0;
		if(x == y) System.out.print(x);
		else if(x >= y) {
			while(x % y > 0) {
				temp = x % y;
				x = y;
				y = temp;
			}
			System.out.print(temp);
		}
		else {
			while(y % x > 0) {
				temp = y % x;
				y = x;
				x = temp;
			}
			System.out.print(temp);
		}
	}
}

