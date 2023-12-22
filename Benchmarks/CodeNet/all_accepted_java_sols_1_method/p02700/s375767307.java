
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int[] a = new int[4];

		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(lines[i]);
		}

		boolean TakahashiWinFlag = true;
		for(;;) {
			a[2] = a[2] - a[1];
			if(a[2] <= 0) {
				TakahashiWinFlag = true;
				break;
			}
			a[0] = a[0] - a[3];
			if(a[0] <= 0) {
				TakahashiWinFlag = false;
				break;
			}
		}

		if(TakahashiWinFlag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
