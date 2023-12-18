
import java.util.Scanner;

class test {

    final static int INPUT_LIMIT_MIN_VALUE = 0;
	final static int INPUT_LIMIT_MAX_VALUE = 1000000;

	final static int DATASETS_LIMIT = 200;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int inCnt = 0;
		Scanner in = new Scanner(System.in);

		// 値の入力
		while(inCnt < DATASETS_LIMIT) {
			int i = in.nextInt();
			int j = in.nextInt();
			
			if ( !(INPUT_LIMIT_MIN_VALUE <= i && i <= INPUT_LIMIT_MAX_VALUE || 
					INPUT_LIMIT_MIN_VALUE <= j && j <= INPUT_LIMIT_MAX_VALUE)) {
				return;
			}
					
			int ans = i + j;
			int digits = 1;
			
			for (digits = 1; digits < 8; digits++) {
				ans = ans / 10;
				if(ans <= 0) {
					break;
				}
			}
			
			System.out.println(digits);
			
			if (!in.hasNext()) {
				break;
			}
		}
	}
}