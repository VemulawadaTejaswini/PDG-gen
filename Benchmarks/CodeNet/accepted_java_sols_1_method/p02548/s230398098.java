import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i < n; i++) {
			count += (n-1)/i;
		}
		System.out.print(count);

	}

}