/**
 * 
 */
import java.util.*;
/**
 * @author akira
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n;
		while(scan.hasNext()){
			n = scan.nextInt();
			int ans = 1;
			for(int i = 1;i <= n;i++){
				ans += i;
			}
			System.out.println(ans);
		}
	}

}