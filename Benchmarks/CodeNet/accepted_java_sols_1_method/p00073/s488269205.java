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
		int x, h;
		while(true){
			x = scan.nextInt();
			h = scan.nextInt();
			if(x == 0 && h == 0){
				break;
			}
			System.out.println("" + (x * x + 2 * Math.sqrt(Math.pow(x / 2.0,2.0) + Math.pow((double)h,2.0)) * x));
		}
	}

}