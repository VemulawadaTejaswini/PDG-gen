import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int add = A + B;
		int sub = A - B;
		int mul = A * B;
		
		int ans = add;
		if(sub > ans) {
			ans = sub;
		}
		if(mul > ans) {
			ans = mul;
		}
		// 出力
		System.out.println(ans);
	}
}