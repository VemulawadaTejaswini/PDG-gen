import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char a = sc.next().charAt(0);

		int ascii = (int) a;

		if(ascii>91) {
			System.out.println("a");
		}else {
			System.out.println("A");
		}


	}

}
