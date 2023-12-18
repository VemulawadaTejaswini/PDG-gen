import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		if(scan.next().equals("ABC")) {
			System.out.println("ARC");
		}else {
			System.out.println("ABC");
		}
		
		scan.close();
	}

}