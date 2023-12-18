import java.util.Scanner;
public class Main {

	public static void main(String args []){
		Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			int h = i / 3600;
			int m = (i / 60) % 60;
			int s = i % 60;
			System.out.print("" + h);
			System.out.print(":" + m);
			System.out.println(":"+ s);
			
	}
}