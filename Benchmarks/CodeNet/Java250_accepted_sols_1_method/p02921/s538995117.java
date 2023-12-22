import java.util.Scanner;

public class Main {

	/*
	 * 文字列を分割して回数を数える
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String yosou = s.next();
		String kekka = s.next();

		s.close();

		String[] yosou1 = yosou.split("");
		String[] kekka1 = kekka.split("");
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (yosou1[i].equals(kekka1[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

}
