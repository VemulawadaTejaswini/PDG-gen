import java.util.Scanner;

public class Main {
	
	private static Scanner sc;
	
	public static void main (String args[]) {
		sc = new Scanner(System.in);
		//範囲の最小値
		int lNum = Integer.parseInt(sc.next());
		//範囲の最大値
		int rNum = Integer.parseInt(sc.next());
		//倍数の対象
		int dNum = Integer.parseInt(sc.next());

		int resultNum = 0;
		for(int i = lNum; i<=rNum; lNum++) {
			int def = i%dNum;
			//割り切れるなら倍数と判断
			if(def==0) {
				resultNum++;
			}
		}
		System.out.println(resultNum);		
	}	
}
