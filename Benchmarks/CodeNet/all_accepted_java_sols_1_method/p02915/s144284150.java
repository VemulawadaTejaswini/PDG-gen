import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		System.out.println(input*input*input); //Math.pow would output double
	}
}