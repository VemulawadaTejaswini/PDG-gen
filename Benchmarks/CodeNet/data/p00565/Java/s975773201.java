import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static String sugoroku = "";
	public static void main(String[] args) {
		inputSugoroku();
		solveSugoroku();

	}
	private static void solveSugoroku() {
		int dice = 0;
		String[] safes = sugoroku.split("0");

			for(int i = 0; i < safes.length; i++) {
				dice = Math.max(dice, safes[i].length());
			}
		System.out.println(dice + 1);
	}
	private static void inputSugoroku() {
		StringBuilder sb = new StringBuilder();

			for(int i = 0; i < n; i++) {
				sb.append(sc.nextInt());
			}

		sugoroku = sb.toString();

	}

}
