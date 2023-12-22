
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		line = sc.nextLine();
		String[] chars = line.split("");
		for(int i = 0; i < chars.length; i++) {
			if(i == K-1) {
				chars[i] = chars[i].toLowerCase();
			}
			System.out.print(chars[i]);
		}
		System.out.println();
	}

}
