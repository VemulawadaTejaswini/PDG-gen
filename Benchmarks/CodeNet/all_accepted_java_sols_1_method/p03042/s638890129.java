
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		//1234
		String YY = S.substring(0, 2);
		String MM = S.substring(2, 4);

		int yy = Integer.parseInt(YY);
		int mm = Integer.parseInt(MM);

		//YYMM
		//yy>12 && 01 <= MM <= 12

		//MMYY
		//13 > yy && MM >12

		//AMBIGUOUS
		//01 <= MM <= 12 && 12 >= yy

		//NA
		// else
		if((yy > 12  || yy == 0)&& (1 <= mm && mm <=12)){//
			System.out.println("YYMM");
		}else if((12 >= yy && yy > 0) && (mm > 12 || mm == 0)) {//0100
			System.out.println("MMYY");
		}else if(12 >= yy && (1 <= mm && mm <=12) ) {
			System.out.println("AMBIGUOUS");
		}else {
			System.out.println("NA");
		}


	}

}
