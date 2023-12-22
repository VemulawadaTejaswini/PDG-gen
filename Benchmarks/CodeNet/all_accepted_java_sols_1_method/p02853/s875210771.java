import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num = 0;
		switch(x) {
		case 1:
			num +=300000;
			break;
		case 2:
			num +=200000;
			break;
		case 3:
			num +=100000;
			break;
		
		}
		switch(y) {
		case 1:
			num +=300000;
			break;
		case 2:
			num +=200000;
			break;
		case 3:
			num +=100000;
			break;
		
		}
		if(num ==600000) {
			num += 400000;
		}
		System.out.println(num);

				

	}

}