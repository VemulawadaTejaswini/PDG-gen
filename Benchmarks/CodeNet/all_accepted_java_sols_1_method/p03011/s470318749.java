import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a[] = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();

		// 計算
		int result = 0;
		Arrays.sort(a);
		result = a[0] + a[1];
		
		// 出力
		System.out.println(result);
		
	}
}
