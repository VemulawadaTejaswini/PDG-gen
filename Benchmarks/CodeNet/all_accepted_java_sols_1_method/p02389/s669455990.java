import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int wide = input.nextInt();
		
		int area = length * wide;
		int para = 2 * length + 2 * wide;
		System.out.println(area + " " + para);
		
		input.close();
	}

}