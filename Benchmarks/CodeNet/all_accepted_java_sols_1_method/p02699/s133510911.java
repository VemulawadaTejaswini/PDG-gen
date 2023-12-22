import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int s = sc.nextInt();
		int w = sc.nextInt();
		
		// 計算
		String result = "safe";
		if(w >= s) result = "unsafe";
		
		// 出力
		System.out.println(result);
	}
}

