import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a+b<=16 && a<=8 && b<=8) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
	}

}