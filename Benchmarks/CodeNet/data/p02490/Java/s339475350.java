import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ((x != 0) || (y != 0)) {
			if ((x == 0) && (y == 0)) break;
			
			if (x > y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}

	}

}