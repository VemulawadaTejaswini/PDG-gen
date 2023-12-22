import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 文字列の入力
		int diff = b-a;
		int sum = 0;
		for(int i=1;i<=diff;i++){
			sum = sum + i;
		}
      System.out.println(sum - b);
	}
}