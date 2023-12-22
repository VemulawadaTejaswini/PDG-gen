import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int x = sc.nextInt();
		int t = sc.nextInt();
		if (x - t > 0) {
			System.out.println(x - t);
		} else {
			System.out.println(0);
		}
		return;
	}
}
