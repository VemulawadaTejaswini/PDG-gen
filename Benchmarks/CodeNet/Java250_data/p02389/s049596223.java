import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int width = scan.nextInt();
		
		int area = length * width;
		int syuu = 2 * (length + width);
		System.out.println(area + " " + syuu);
		
	}

}