import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 計算
		//String result = "";
		int tmp = a;
		a = b;
		b = tmp;
		tmp = a;
		a = c;
		c = tmp;
		System.out.println(a + " " + b + " " + c);
		
		// 出力
		//System.out.println(result);
	}
}

