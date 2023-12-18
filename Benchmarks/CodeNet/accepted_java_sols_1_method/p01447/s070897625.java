import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long n = stdIn.nextInt();
		int counter = 0;
		while(n > 1) {
			if(n % 3 == 2) n++;
			if(n % 3 == 1) n+=2;
			n /= 3;
			
			counter++;
		}
		System.out.println(counter);
	}
}