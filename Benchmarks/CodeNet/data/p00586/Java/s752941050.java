import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			System.out.println(a + b);
		}
	}

}