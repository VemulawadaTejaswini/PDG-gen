import java.util.Scanner;
public class  Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(a - b < c) {
			System.out.println(c-(a-b));
		}else {
			System.out.println(0);
		}
		
		
		
		
	}

}
