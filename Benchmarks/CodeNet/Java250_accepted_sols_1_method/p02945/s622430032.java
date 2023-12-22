import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1行目の整数を読み込む
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//A+B,A-B,A×Bを計算する
		int AplusB = A+B ;
		int AminusB = A-B;
		int AmultiplyB = A*B;
		
		//3つの計算結果を比較し、最大のものを変数maxに入れる
		int max;
		max = AplusB;
		
		if(AplusB < AminusB) {
			max = AminusB;
			if (AminusB < AmultiplyB) {
				max = AmultiplyB;
			}
		}else if(AplusB < AmultiplyB){
			max = AmultiplyB;
		}
		
		System.out.println(max);
			
	}
}
