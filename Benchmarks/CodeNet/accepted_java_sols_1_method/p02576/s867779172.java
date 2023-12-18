import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int t = scan.nextInt();
		scan.close();

		int total = 1;


		while(true) {
			int a = x*total;
			if(n<=a) {
				break;
			}
			total++;
		}

		System.out.println(total*t);

	}

}
