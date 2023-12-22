import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		int d = X/100;
		int r = X%100;
		
		if(r <= 5*d) System.out.println(1);
		else System.out.println(0);

	}

}