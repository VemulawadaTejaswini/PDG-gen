
import java.util.Scanner;

class test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int inCnt = 0;
		Scanner in = new Scanner(System.in);

		// 値の入力
		while(inCnt < 200) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			System.out.println(Integer.toString(i+j).length());
			
			if (!in.hasNext()) {
				break;
			}
			inCnt++;
		}
	}
}