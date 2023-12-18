import java.util.*;

public class Main {// AtCorderの時はMainじゃないとコンパイルエラーになる

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		if (S.equals("SSS")) {
			System.out.print("0");
		} else if (S.equals("RRS")||S.equals("SRR")) {
			System.out.print("2");
		} else if (S.equals("RRR")) {
			System.out.print("3");
		} else {
			System.out.print("1");
		}

	}
}
