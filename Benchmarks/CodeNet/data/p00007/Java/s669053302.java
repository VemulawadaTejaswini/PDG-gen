import java.util.Scanner;

public class Main{
	static int debt(int n){
		int x = 100000;
		while( n > 0 ){
			x *= (1 + 0.05);
			if( x%1000 != 0 ){
				x = x - x%1000 + 1000;
			}
			n--;
		}
		return x;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		System.out.println(debt(n));
	}
}