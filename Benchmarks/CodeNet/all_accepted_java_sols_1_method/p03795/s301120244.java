import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int x = 800*a;
		int y = a/15*200;
		
		System.out.println(x-y);
		
	}

}