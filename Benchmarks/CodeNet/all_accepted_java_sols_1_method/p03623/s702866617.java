import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		String result = "A";
		if(abs(x-a) > abs(x-b)) result = "B";
		
		// 出力
		System.out.println(result);
	}
}


