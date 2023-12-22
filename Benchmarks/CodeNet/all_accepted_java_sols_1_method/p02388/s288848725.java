import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int x = 0; 
		while (1 > x || x > 101){
			x = stdIn.nextInt();
		}
		System.out.println(x * x * x);
		stdIn.close();
	}
}