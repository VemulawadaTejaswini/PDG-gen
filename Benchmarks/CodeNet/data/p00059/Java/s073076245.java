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
		double xa1, ya1, xa2, ya2, xb1, yb1, xb2, yb2;
		while(scan.hasNext()){
			xa1 = scan.nextDouble(); ya1 = scan.nextDouble();
			xa2 = scan.nextDouble(); ya2 = scan.nextDouble();
			xb1 = scan.nextDouble(); yb1 = scan.nextDouble();
			xb2 = scan.nextDouble(); yb2 = scan.nextDouble();
			
			if(contain(xa1,ya1,xa2,ya2,xb1,yb2) || contain(xa1,ya1,xa2,ya2,xb2,yb2) || contain(xa1,ya1,xa2,ya2,xb1,yb1) || contain(xa1,ya1,xa2,ya2,xb2,yb1)){
				System.out.println("YES");	
			}else{
				System.out.println("NO");
			}
			
		}
	}
	static boolean contain(/*left-down*/double ldx,double ldy,/*right-up*/double rux,double ruy,double x,double y){
		if(ldx <= x && x <= rux && ldy <= y && y <= ruy){
			return true;
		}else{
			return false;
		}
	}

}