
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		  System.setIn(B081.class.getResourceAsStream("input.txt"));
		  Scanner in = new Scanner(System.in);

		  int n = in.nextInt();
		  int alice = 0;
		  int bob = 0;
		  Integer card[] = new Integer[n];

		  for(int i= 0; i < n; i++) {
			  card[i] = in.nextInt();
		  }

		  Arrays.sort(card,  Collections.reverseOrder());

		  for(int i = 0; i < n; i++) {
			  if(i == 0) {
				  alice += card[i];
				  continue;
			  }
			  if(i % 2 != 0) {
				  bob +=card[i];
				  continue;
			  }
			  alice += card[i];
		  }
		  System.out.println(alice - bob);
		  in.close();
	}
}