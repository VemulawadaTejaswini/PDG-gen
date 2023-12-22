import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		// スペース区切りの整数の入力
		int B = sc.nextInt();

		int values[] = {A+B, A-B, A*B};
		int max = values[0];
		for(int i = 1; i < 3; i ++){
			max = Math.max(max, values[i]);
		}

		System.out.println(max);
	}
}