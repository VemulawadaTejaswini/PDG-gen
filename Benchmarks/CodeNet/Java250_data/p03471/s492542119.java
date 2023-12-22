import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// お札の枚数（10000万円札、5000円札、1000円札）
		int y = sc.nextInt();// 合計金額(1000の倍数)

		// 計算
		int countA = -1;
		int countB = -1;
		int countC = -1;

		for(int a = 0; a <= n; a++){
			for(int b = 0; a + b <= n; b++){
				if(10000 * a + 5000 * b + 1000 * (n - a - b) == y){
					countA = a;
					countB = b;
					countC = n - a -b;
				}
			}
		}

		// 出力
		System.out.println(countA + " " + countB + " " + countC);
	}

}


