import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		Double b = sc.nextDouble();
		long b100 = (long)(b * 100);
		long answer = a * b100;
		String answerS = String.valueOf(answer);
		if(answerS.length() <3) {
			System.out.println(0);
			return;
		}
		System.out.println(answerS.substring(0,answerS.length()-2));
	}

}