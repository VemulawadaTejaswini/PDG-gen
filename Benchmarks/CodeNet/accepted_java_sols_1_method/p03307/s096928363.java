import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		if (n % 2 == 0){
			System.out.println(n);
		}
		else{
			System.out.println(n * 2);
		}
	}
}