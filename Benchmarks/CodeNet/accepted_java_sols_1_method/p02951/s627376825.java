import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		// スペース区切りの整数の入力
		int B = sc.nextInt();

		int C = sc.nextInt();

		int res = C - (A - B);
		if(res < 0){
			res = 0;
		}

		System.out.println(res);
	}
}