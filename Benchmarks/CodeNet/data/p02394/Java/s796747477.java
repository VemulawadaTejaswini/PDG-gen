import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		int a = y+r;
		int b = x+r;
		int c = y-r;
		int d = x-r;

		if(a<=H&&c>=0&&b<=H&&d>=0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
