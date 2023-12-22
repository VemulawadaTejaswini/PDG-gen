import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();

		if(((A + B) % 2) == 0){
			System.out.println((A + B) / 2);
		}
		else{
			System.out.println("IMPOSSIBLE");
		}
		stdIn.close();
	}
}