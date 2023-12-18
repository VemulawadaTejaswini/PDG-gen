
import static java.lang.Character.*;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		long t = 0;
		for(int i = 0; i < N.length(); i++)
			t += getNumericValue(N.charAt(i));
		
		if(t % 9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
