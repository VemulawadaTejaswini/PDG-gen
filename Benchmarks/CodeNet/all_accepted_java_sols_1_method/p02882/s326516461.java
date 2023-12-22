
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int x =sc.nextInt();
		
		//溢れる瞬間には、水は底辺b,高さ1以下の直角三角形を底面とする高さaの三角柱
		//この体積が、a*a*b
		
		double ans=0;
		double tmp=0;
		
		//体積が、a*a*b/2いかのとき、
		if(x<=(a*a*b/2)) {
			tmp=((double)2*x)/(a*b*b);
			ans = 90.0 - Math.atan(tmp)*180.0/Math.PI;//度数に直す
			
		}else {
			//倒した時に三角形ができない。台形になる場合
			tmp=((double)2*(a*a*b-x))/(a*a*a);
			ans = Math.atan(tmp)*180.0/Math.PI;//度数に直す
		}
		
		System.out.println(ans);
	}
}
