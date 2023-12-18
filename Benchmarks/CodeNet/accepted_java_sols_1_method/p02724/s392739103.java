import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();

		int totalHappy = 0;
        	totalHappy += (S/500) * 1000;
        	S = S%500;
        	totalHappy += (S/5) * 5;
        	S = S%5;
        	System.out.println(totalHappy);

	}
}