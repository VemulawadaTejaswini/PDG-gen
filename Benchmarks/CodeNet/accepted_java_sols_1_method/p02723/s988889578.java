
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc  = new Scanner(System.in);
		String lines = sc.nextLine();
		int lengthLine = lines.length();

		if(lengthLine == 6) {
			String[] line = lines.split("");
			if(line[2].equals(line[3]) && line[4].equals(line[5]) ){
				System.out.println("Yes");
			}
			else {

				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}

	}

}
