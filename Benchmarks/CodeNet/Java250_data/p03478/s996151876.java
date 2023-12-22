import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		for(int i =1;i <= n;i++) {
			int digitSum = calcDigitSum(i);
			if(digitSum >= a && digitSum <= b) {
				answer+= i;
			}
		}
		System.out.println(answer);
	}

	private static int calcDigitSum(int i) {
		String[] digitArray = String.valueOf(i).split("");
		int result = 0;
		for(String digit : digitArray) {
			result += Integer.parseInt(digit);
		}
		return result;
	}
}