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
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 0;i < n;i++){
			double x1 = scan.nextDouble(), y1 = scan.nextDouble(), x2 = scan.nextDouble(), y2 = scan.nextDouble();
			double a = x2 - x1, b = y2 - y1;
			double x3 = scan.nextDouble(), y3 = scan.nextDouble(), x4 = scan.nextDouble(), y4 = scan.nextDouble();
			double c = x4 - x3, d = y4 - y3;
			double e = a * d - b * c;
			if(e == 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

}