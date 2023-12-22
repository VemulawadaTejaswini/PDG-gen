import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int S = sc.nextInt();
		int left = S/100 ;
		int right = S%100 ;

		boolean YYMM  = false ;
		boolean MMYY = false ;

		//YYMM
		{
			if(1 <= right && right <= 12) {
				YYMM = true ;
			}
		}

		//MMYY
		{
			if(1 <= left && left <= 12) {
				MMYY = true ;
			}
		}


		// 出力
		if(YYMM && MMYY) {
			System.out.println("AMBIGUOUS");
		}else 	if(YYMM && !MMYY) {
			System.out.println("YYMM");
		}else 	if(!YYMM && MMYY) {
			System.out.println("MMYY");
		}else {
			System.out.println("NA");
		}

	}

}
