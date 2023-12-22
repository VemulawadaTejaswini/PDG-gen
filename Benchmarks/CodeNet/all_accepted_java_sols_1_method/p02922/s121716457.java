import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		int kutikazu = 1;
		int tapNum = 0;


		for(int i=0;i<b;i++) {
			if(kutikazu>=b) {
				System.out.println(tapNum);
				break;
			}
			kutikazu = kutikazu - 1 + a;
			tapNum += 1;
		}
	}

}
