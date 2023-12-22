import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		if(n == 2){
		    a = sc.nextInt();
		    b = sc.nextInt();
		}
		
		// 計算
		if(n == 1) System.out.println("Hello World");
		if(n == 2) System.out.println(a + b);
		
	}
}