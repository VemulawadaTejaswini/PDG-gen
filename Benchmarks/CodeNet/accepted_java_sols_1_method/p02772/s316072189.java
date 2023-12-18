import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		boolean flg = true;
		int n = sc.nextInt();
		for( int i=0; i<n; i++) {
		    int num = sc.nextInt();
		    if (num % 2 == 1) continue;
		    if (num % 3 == 0 || num % 5 == 0) continue;
		    flg = false;
		}
		if (flg) {
		    System.out.println("APPROVED");
		} else {
		    System.out.println("DENIED");
		}
	}
}