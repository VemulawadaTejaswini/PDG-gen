import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
        // 積の計算
		int c = a*b;
		// if文
		if( c % 2 == 0 ) 
          System.out.println("Even");
        else
          System.out.println("Odd");
	}
}