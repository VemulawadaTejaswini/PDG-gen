import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num = 0;
		num = N % 10;
		if((num == 2)||(num == 4)||(num == 5)||(num == 7)||(num == 9) ) {
			System.out.println("hon");
		}else if((num == 0)||(num == 1)||(num == 6)||(num == 8)) {
			System.out.println("pon");
		}else if(num == 3) {
			System.out.println("bon");
		}
	}

}
