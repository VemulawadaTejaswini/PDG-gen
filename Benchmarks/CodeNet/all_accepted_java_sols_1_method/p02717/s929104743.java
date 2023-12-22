import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		int x;
		int y;
		int z;
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String[] numbers = num.split(" ");
		x = Integer.parseInt(numbers[0]);
		y = Integer.parseInt(numbers[1]);
		z = Integer.parseInt(numbers[2]);

System.out.println(z+" "+x+" "+y);

	}
}
