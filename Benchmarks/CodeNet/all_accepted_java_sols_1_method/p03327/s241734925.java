import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>=1 && n<=999) {
			System.out.println("ABC");
		}else if(n>999 && n<=1998) {
			System.out.println("ABD");
		}
	}
}
