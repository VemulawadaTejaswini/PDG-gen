

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		Double S = Double.parseDouble(lines[0]);
		Double W = Double.parseDouble(lines[1]);

		if(W >= S) {
			System.out.println("unsafe");
		}
		else {
			System.out.println("safe");
		}
	}

}
