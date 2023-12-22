import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		// 計算
		String result = "-1 -1 -1";
		int a = y/10000;
		int b = (y%10000)/5000;
		int c = (y%5000)/1000;
		
		for(int i = 0; i <= a; i++){
		    for(int j = 0; j <= b + (a - i)*2; j++){
		        int k = c + (b + (a - i)*2 - j)*5;
		        if(i + j + k == n){
		            System.out.println(i + " " + j + " " + k);
		            return;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}

