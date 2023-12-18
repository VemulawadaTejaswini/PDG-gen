import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());

		if (a % 2 == 0) {
			System.out.println(a/2 -1);			
		}else {
			System.out.println(a/2);
		}
		
		
	}
	
}