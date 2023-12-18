import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int a = scan.nextInt();
		
		int ans = h / a;
		if(ans * a == h) {
			System.out.print(ans);
			return;
		}
		else {
			System.out.print(ans+1);
		}
	}

}
