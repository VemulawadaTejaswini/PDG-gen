import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 計算
		int k = a + b;
		String result = "No";

		// 出力
		if(k%2 == 0){
		   System.out.println(k/2);
		}else{
		   System.out.println("IMPOSSIBLE");
		}
	}
	
}
