import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			
			if(n == 0) break;
			int count = 0;
			for(int i = 1; i <= n - 2; i++) {
				for(int j = i + 1; j <= n - 1; j++) {
					int check_number = x - i - j;
					if(check_number <= n && check_number > j) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		
	}

}

