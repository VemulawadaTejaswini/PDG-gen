import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();

		// 500円の枚数
		int count500 = X/500;
		// 余り
		int too = X%500;
		
		// 5円の枚数
		int count5 = too/5;
		
		System.out.println(count500 * 1000 + count5 * 5);
		
	}
}
