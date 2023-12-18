import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//スキャナークラスを宣言
		Scanner scan = new Scanner(System.in);

		//int型の宣言と入力された数値を代入
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		int intNum3 = scan.nextInt();

		//約数の個数
		int intCount = 0;

		for(;intNum1 <= intNum2 ;intNum1++){
			//Num3をNum1で割った余り
			int intRemainder = intNum3 % intNum1;

			//Num3をNum1+nで割り、余りがない場合,Num1+nはNum3の約数
			if(intRemainder == 0){
				intCount++;
			}
		}
		System.out.println(intCount);
		scan.close();
	}
}
