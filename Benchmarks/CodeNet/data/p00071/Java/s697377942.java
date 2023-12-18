/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			scan.nextLine();
			scan.nextLine();
			String[] mp = new String[8];
			for(int j = 0;j < mp.length;j++){
				mp[j] = scan.nextLine();
			}
			rec(mp,scan.nextInt() - 1,scan.nextInt() - 1);
			System.out.println("Data " + (i + 1) + ":");
			for(int j = 0;j < 8;j++){
				System.out.println("" + mp[j]);
			}
		}
	}

	public static void rec(String[] mp, int x, int y) {
		final int[] dy = { -1, -2, -3, 0, 0, 0, 1, 2, 3, 0, 0, 0 }, dx = { 0,
				0, 0, 1, 2, 3, 0, 0, 0, -1, -2, -3 };
		mp[y] = mp[y].substring(0, x) + "0"
				+ mp[y].substring(x + 1, mp[y].length());
		for (int i = 0; i < dy.length; i++) {
			if (0 <= y + dy[i] && y + dy[i] < 8 && 0 <= x + dx[i]
					&& x + dx[i] < 8 && mp[y + dy[i]].charAt(x + dx[i]) == '1') {
				rec(mp, x + dx[i], y + dy[i]);

			}
		}
	}

}