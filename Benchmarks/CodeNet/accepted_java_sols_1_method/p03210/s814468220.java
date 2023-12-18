import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int old = sc.nextInt();
		if(old ==3 || old == 5 || old == 7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
