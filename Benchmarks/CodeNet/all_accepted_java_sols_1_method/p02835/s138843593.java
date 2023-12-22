import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A1 = stdIn.nextInt();
		int A2 = stdIn.nextInt();
		int A3 = stdIn.nextInt();
		int sum = 0;
		sum = A1 + A2 + A3;
		if(sum > 21){
			System.out.println("bust");
		}
		else{
			System.out.println("win");
		}
		stdIn.close();
	}
}
