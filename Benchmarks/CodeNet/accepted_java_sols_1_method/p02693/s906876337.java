import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		String result = "NG";
		for(int i = a; i <= b; i++){
		    if(i%k == 0) result = "OK";
		}
		
		// 出力
		System.out.println(result);
	}
}

