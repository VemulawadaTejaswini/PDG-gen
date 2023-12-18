import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int h1 = scan.nextInt();
		int m1 = scan.nextInt();
		int h2 = scan.nextInt();
		int m2 = scan.nextInt();
		int k = scan.nextInt();
		
		int total = (h2 * 60 + m2) - (h1 * 60 + m1);
		int ans = total -k;
		
		System.out.println(ans);
	}

}
