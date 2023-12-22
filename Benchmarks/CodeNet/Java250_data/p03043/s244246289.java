import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();

		double ans = 0;
		double n2 = n;
		double value = 1;

		for(double i=n;i>0;){
			if(i*value<k){
				value *= 2;
			} else {
				ans += 1.0/(n*value);
				i--;
			}
		}

		// 出力
		System.out.println(ans);
	}
}