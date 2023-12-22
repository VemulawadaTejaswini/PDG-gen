import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		//出力用
    int s = a * b;

		// 文字列の入力
		if ((1 <= a && a <= 9) && (1 <= b && b <= 9) ){
				//何もしない
		}
		else{
			s = -1;
		}
		// 出力
		System.out.println(s);
	}
}
