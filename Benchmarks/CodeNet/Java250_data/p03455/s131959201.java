import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// a、bの入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 積を計算
		int c = a * b;

		// 偶数なら'Even'、奇数なら'Odd'を出力
		if(isEven(c)){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}

	static boolean isEven(int n){
		if(n%2 == 0){
			return true;
		}else{
			return false;
		}
	}

}