import java.util.Scanner;

/**
 * AOJのVolume0の0095を解くクラス
 * @author たっちゃん
 *
 */
public class Main {
	/**
	 * mainメソッド。
	 * @param args 使用せず
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int minA = Integer.MAX_VALUE, maxV = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int v = scan.nextInt();
			if(maxV < v) {
				minA = a;
				maxV = v;
			} else if(maxV == v) {
				minA = Integer.min(minA, a);
			}
		}
		System.out.println(minA + " " + maxV);
		scan.close();
	}

}


