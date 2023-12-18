import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int sum = 0;

		sum += a>b?a--:b--;
		sum += a>b?a--:b--;

		// 出力
		System.out.println(sum);
	}
}