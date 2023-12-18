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
		while(scan.hasNextLine()){
			String str = scan.nextLine();
			String winner = "d";
			final int[][] winPattern = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
			for(int i = 0;i < winPattern.length;i++){
				if(str.charAt(winPattern[i][0]) == str.charAt(winPattern[i][1]) && str.charAt(winPattern[i][0]) == str.charAt(winPattern[i][2])){
					winner = "" + str.charAt(winPattern[i][0]);
				}
			}
			System.out.println(winner);
		}
	}

}