import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int answer = 0;
		answer+=(N/500)*1000; N%=500;
		answer+=(N/5)*5;
		System.out.println(answer);
	}
}