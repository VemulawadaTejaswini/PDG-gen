import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean a = false;
		for(int i = 0; i <= x; i++) {
			if(2*x+2*i == y) {
				a = true;
			}
		}
		if(a == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}