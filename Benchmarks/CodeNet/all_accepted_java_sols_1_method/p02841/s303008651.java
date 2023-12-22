import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String first = scanner.nextLine();
		String second = scanner.nextLine();

		String[] f = first.split(" ");
		String[] s = second.split(" ");

		if(Integer.parseInt(f[1])- Integer.parseInt(s[1]) < 0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}


	}

}
