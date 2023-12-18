import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		Double aDouble  = 2 * Math.PI * r;
		Double bDouble = Math.pow(r, 2) * Math.PI;
		
		System.out.println(aDouble + " " + bDouble);
                scanner.close();
	}
}