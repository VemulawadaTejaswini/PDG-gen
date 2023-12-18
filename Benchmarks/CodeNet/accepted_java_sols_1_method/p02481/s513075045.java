import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int area = 0;
		int circuit = 0;
		
		area = x * y;
		circuit = x * 2 + y * 2;
		
		System.out.println(area + " " + circuit);
		
		scan.close();
	}
}