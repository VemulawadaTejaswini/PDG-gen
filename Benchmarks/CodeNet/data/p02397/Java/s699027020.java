import java.util.Scanner;

public class Main {

	public static void twoNumbers() {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		while(true) {
			x = scan.nextInt();
			y = scan.nextInt();
			if((x == 0) && (y == 0)) break;
			if(x < y){
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		twoNumbers();
	}

}

