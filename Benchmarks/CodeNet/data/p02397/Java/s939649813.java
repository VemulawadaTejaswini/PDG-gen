import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ1
		int x;
		int y;
		int t;

	    Scanner sc = new Scanner(System.in);

		while(true) {
		    x = sc.nextInt();
		    y = sc.nextInt();

		    if(x == 0 && y == 0) break;

			if(x>y) {
				t = x;
				x = y;
				y = t;
			}
			System.out.printf(String.format("%d %d\n",x, y));
		}

	}

}

