
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//Aの入力
		int b = sc.nextInt();//Bの入力
		int c = sc.nextInt();//Bの入力
		for(int i = 1; i <= b; i++) {
			if((a * i) % b == c) {
				System.out.print("YES");
				break;
			}
			if(i == b) {
				System.out.print("NO");
			}
		}
	}
}
