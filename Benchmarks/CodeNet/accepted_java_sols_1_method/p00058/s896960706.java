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
		final double eps = 1e-10;
		Scanner scan = new Scanner(System.in);
		double x1, y1, x2, y2, x3, y3, x4, y4;
		while(scan.hasNextDouble()){
			x1 = scan.nextDouble(); y1 = scan.nextDouble();
			x2 = scan.nextDouble(); y2 = scan.nextDouble();
			x3 = scan.nextDouble(); y3 = scan.nextDouble();
			x4 = scan.nextDouble(); y4 = scan.nextDouble();
			double vax = x2 - x1, vay = y2 - y1;
			double vbx = x4 - x3, vby = y4 - y3;
			if(Math.abs(vax * vbx + vay * vby) < eps){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}