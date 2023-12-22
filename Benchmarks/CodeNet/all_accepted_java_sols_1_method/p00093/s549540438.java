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
		int a, b;
		boolean first = true;
		while(scan.hasNextInt()){
			a = scan.nextInt();
			b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			if(!first){
				System.out.println("");
			}
			first = false;
			boolean bl = true;
			for(int i = a;i <= b;i++){
				if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
					System.out.println("" + i);
					bl = false;
				}
			}
			if(bl){
				System.out.println("NA");
			}
		}
	}

}