import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		String result = "NO";
		if((100*r +  10*g + b)%4 == 0) result = "YES";

		// 出力
		System.out.println(result);
	}
}

