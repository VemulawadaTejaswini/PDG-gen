/**
 * 
 */
import java.util.*;
/**
 * @author afterCmidday
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int cnt = 0, ans1 = 0, sumNum = 0;
		while(scan.hasNext()){
			String str = scan.next();
			int x1 = Integer.parseInt((str.substring(0,str.indexOf(","))));
			int x2 = Integer.parseInt((str.substring(str.indexOf(",") + 1,str.length()))); 
			ans1 += x1 * x2;
			sumNum += x2;
			cnt++;
		}
		double ans2 = (double)sumNum / cnt;
		System.out.format("%d\n%d\n",ans1,(int)(ans2 + 0.5));
	}

}