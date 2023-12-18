import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int n = b - a + 1;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(c % (a + i) == 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}

