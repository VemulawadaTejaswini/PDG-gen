import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();
		
		if((x - r) >= 0 && (x + r) <= w && (y - r) >= 0 && (y + r) <= h) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}

