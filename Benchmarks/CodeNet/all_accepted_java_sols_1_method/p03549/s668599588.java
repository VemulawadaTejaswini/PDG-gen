import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 計算
		int result = 0;
		result = (100*(n-m)+1900*m)*(int)pow(2,m);
		
		// 出力
		System.out.println(result);
	}
}


