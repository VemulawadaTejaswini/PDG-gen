import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		char C = stdIn.next().charAt(0);
		C++;
		System.out.println(C);
		stdIn.close();
	}
}