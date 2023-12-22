import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = n; i < 1000; i++) {
			if(i % 111 == 0) {
				System.out.println(i);
				return;
			}
			
			
		}
		
		
	}

}
