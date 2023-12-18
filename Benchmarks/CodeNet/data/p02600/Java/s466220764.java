

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		switch (X / 100) {
			case 4:
			case 5:
				System.out.println(8);
				break;
			case 6:
			case 7:
				System.out.println(7);
				break;
			case 8:
			case 9:
				System.out.println(6);
				break;				
			case 10:
			case 11:
				System.out.println(5);
				break;				
			case 12:
			case 13:
				System.out.println(4);
				break;				
			case 14:
			case 15:
				System.out.println(3);
				break;				
			case 16:
			case 17:
				System.out.println(2);
				break;				
			case 18:
			case 19:
				System.out.println(1);
				break;				
		}

	}

}
