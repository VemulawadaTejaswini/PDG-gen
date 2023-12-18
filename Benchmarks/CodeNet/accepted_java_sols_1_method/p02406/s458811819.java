import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			// 3の倍数又は3を含む数字の場合は
			if(i % 3 == 0 || Integer.toString(i).contains("3")) {
				System.out.print(" "+i);
			}
		}
		System.out.println();

	}

}
