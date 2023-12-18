import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int ans = 1;
		
		for (int i = 0; i < 3; i++) {
			ans *= x;
		}
		
		System.out.println(ans);

	}

}