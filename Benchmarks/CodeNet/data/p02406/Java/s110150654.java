
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for(int i = 1; i < x + 1; i++) {
			if(i % 3 == 0) {
				System.out.print(" " + i);
			}
			else {
				int temp = i;
				while(temp >= 1) {
					if(temp % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					temp /= 10;
				}
			}
		}
				System.out.println();
	}

}
