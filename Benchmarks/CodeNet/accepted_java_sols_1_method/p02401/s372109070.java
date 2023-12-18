import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		//スキャナー型を宣言
		Scanner scan = new Scanner(System.in);

		while(true){
			//入力された文字列を変数に代入
			String strNum1 = scan.next();
			String strOpe = scan.next();
			String strNum2 = scan.next();

			//int型に変換
			int intNum1 = Integer.parseInt(strNum1);
			int intNum2 = Integer.parseInt(strNum2);

			if(strOpe.equals("+")){
				System.out.println(intNum1 + intNum2);
			}else if(strOpe.equals("-")){
				System.out.println(intNum1 - intNum2);
			}else if(strOpe.equals("*")){
				System.out.println(intNum1 * intNum2);
			}else if(strOpe.equals("/")){
				System.out.println(intNum1 / intNum2);
			}else if(strOpe.equals("?")){
				break;
			}
		}
		scan.close();
	}
}


