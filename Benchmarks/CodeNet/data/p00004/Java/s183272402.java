import java.util.*;
import java.math.*;

public class Math {

	/**
	 * @param args
	 */

	static void solve(int[] a){
		double d = a[0]*a[4]-a[1]*a[3];
		BigDecimal x = new BigDecimal(String.valueOf(((double)a[4]*a[2]-a[1]*a[5])/d));
		BigDecimal y = new BigDecimal(String.valueOf(((double)-a[2]*a[3]+a[0]*a[5])/d));
		System.out.printf(
				"%.3f %.3f",
				x.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue(),
				y.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue()
				);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			int[] a= new int[6];
			for(int i=0;i<6;i++){
				a[i]=scan.nextInt();
			}
			solve(a);
		}
	}

}