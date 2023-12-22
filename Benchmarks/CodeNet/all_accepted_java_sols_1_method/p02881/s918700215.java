import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		long N = keyboard.nextLong();
		long Max = 0;
		
		for (long i = 1; i*i <= N; i++) {
			if(N%i == 0) {
				Max = i;
			} 
		}

		System.out.println(Max + N/Max -2);
		keyboard.close();
	}
}
