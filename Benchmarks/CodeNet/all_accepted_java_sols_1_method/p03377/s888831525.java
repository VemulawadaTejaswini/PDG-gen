import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		if(x<=a+b && a<=x) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
