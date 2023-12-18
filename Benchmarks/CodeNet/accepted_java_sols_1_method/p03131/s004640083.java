import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		if(b<=a+2){
			//愚直パタン
			
			System.out.println(k+1);

		}else{
			//交換パターン
			long remain =k-a+1;
			long doDouble = remain/2;
			long result = doDouble*(b-a) + (remain%2) + a;

			// System.out.println(doDouble * (b - a));
			// System.out.println(remain % 2);
			System.out.println(result);
		}

	}
}
