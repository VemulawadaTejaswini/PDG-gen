import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;

		for(int i=1;i<=c;i++) {
			if(i%a==0) {
				result+=b;
			}
		}
		System.out.println(result);
	}
}