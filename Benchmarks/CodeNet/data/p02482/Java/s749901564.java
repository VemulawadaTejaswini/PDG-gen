import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int d = scan.nextInt();
		if (c == d) {
			System.out.println("a == b");
		} else if (c > d){
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
		
		
	
	}
}