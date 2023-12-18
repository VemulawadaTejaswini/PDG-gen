import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numberArray = sc.next().split("");
		int answer = 0;
		for(String number :numberArray) {
			answer += Integer.valueOf(number);
		}
		System.out.println(answer);
	}
}