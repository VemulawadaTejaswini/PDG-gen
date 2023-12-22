import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int counter = 0;
		int[] divisors = new int[10000];
		for(int i = a; i <= b && i <= c; i++ ) {
			if(c % i == 0) {
				divisors[counter] = i;
				counter++;
				
			}
		}
		
		System.out.println(counter);
	}
}