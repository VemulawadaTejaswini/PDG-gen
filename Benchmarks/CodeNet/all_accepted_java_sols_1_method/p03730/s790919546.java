import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int x = a % b;
		boolean ans = false;
		for(int i = 1; i <= b; i++) {
			if((x * i) % b == c) {
				ans = true;
				break;
			}
		}
		if(ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
