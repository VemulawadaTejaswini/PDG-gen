import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((c > a && c < b) || (c < a && c > b) ) {
		    System.out.println("Yes");
		}else if((c < a || c < b) || (c < b || c > a)  ) {
			System.out.println("No");
		}

	}

}