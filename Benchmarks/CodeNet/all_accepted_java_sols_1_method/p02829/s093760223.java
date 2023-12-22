import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int c = a+b;
		
		if(c==3) {
			System.out.println(3);
		}
		if(c==4) {
			System.out.println(2);
		}
		if(c==5) {
			System.out.println(1);
		}
		
		
		
		
	}

}
