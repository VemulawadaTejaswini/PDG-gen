import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		// 計算
		int x3 = x2 - (y2 - y1);
		int y3 = y2 - (x1 - x2);
		int x4 = x1 - (y2 - y1);
		int y4 = y1 - (x1 - x2);
		
		// 出力
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
