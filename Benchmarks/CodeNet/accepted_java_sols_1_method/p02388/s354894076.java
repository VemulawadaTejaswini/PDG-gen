import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		int answer = x * x * x;
		System.out.println(answer);
        input.close();
	}

}