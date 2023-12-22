import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		long ans = x;

		for(int i=0;i<10;i++){
			ans = ans*r-D;

			// 出力
			System.out.println(ans);
		}
	}
}