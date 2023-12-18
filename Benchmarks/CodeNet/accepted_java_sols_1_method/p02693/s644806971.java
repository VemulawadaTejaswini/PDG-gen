import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		for(int i = a; i <=b; i++) {
			if(i % k == 0) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");
		
		
	}

}
