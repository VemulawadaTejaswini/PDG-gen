import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int count = 0;
		boolean flag = true;
		for(int i = 0; i < x + 1; i++) {
			count = 2 * i + 4 * (x - i);
			if(count == y) {
				System.out.println("Yes");
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("No");
		
		
	}

}
