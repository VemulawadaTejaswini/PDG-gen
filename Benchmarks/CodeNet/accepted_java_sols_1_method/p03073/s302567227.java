import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String line = scn.nextLine();
		int length = line.length();
		String S[] = line.split("");
		String answer = S[0].equals("0") ? "1" : "0";
		int count = 0;

		for(int i = 1;i < length;i++) {
			if(!S[i].equals(answer)) {
				count++;
			}
			answer = answer.equals("0") ? "1" : "0";
		}

		System.out.println(count);
	}
}
