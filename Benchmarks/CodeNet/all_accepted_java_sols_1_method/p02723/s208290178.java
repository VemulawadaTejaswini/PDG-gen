
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		char[] input = scanner.nextLine().toCharArray();
		String result = "No";
		if(input[2] == input[3] && input[4] == input[5]) result = "Yes";
		System.out.println(result);
		scanner.close();
	}

}
