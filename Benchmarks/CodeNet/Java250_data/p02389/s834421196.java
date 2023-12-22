import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		int num1 = Integer.parseInt(line[0]);
		int num2 = Integer.parseInt(line[1]);
		
		System.out.println(String.format("%s %s", num1*num2,2*(num1+num2)));
	}
}