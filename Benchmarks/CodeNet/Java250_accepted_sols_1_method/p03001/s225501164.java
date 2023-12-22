import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		
		// input
		long width = scan.nextLong();
		long height = scan.nextLong();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		double area = (width * height) / 2.0;
		System.out.print(area + " ");
		
		if(x + x == width && y + y == height){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		
	}
}