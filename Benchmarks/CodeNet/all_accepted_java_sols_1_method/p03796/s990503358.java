import java.util.*;
public class Main {
	static int modNum = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		long power = 1;
		for(int i = 1;i <= a;i++){
			power = power * i;
			power = power % modNum;
		}
		System.out.println(power);
	}
}