import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
      	boolean ok = d <= s * t;
		System.out.println(ok? "Yes" : "No");
	}
}