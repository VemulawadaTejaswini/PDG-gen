import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		int i;
		int n = sc.nextInt();
		for(i = n - 1; i >= 0; i--) {
			num[i] = sc.nextInt();
		}
		for(i = 0; i < n; i++) {
			System.out.print(num[i]);
			if(i != n - 1) System.out.printf(" ");
		}	
	}
}