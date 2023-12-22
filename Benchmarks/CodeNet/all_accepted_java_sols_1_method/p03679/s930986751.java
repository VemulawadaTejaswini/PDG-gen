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
		String result = "dangerous";
		if(b-a <= 0) result = "delicious";
		if(0 < b-a && b-a <= x) result = "safe";
		
		// 出力
		System.out.println(result);
	}
}
