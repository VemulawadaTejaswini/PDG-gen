// atcoder002

import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		long ans = 1;
		for(int i = 1; i <= input; i++){
			ans *= i;
			ans %= 1000000007;
		}
		
		System.out.println(ans);
	}
}