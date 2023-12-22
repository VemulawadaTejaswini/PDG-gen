import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int input1;
		int input2;

		Scanner sc = new Scanner(System.in);
		// String inputline = sc.next();
		// String[] inputArray = inputline.split("\\s");
		// input1 = Integer.parseInt(inputArray[0]);
		// input2 = Integer.parseInt(inputArray[1]);

		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		int swap;
		if (input1 > input2) {
			
			swap = input2;
			input2 = input1;
			input1 = swap;
		}
		
		// ユークリッドの互除法を用いた最大公約数を
		swap = 0;
		while ((swap = input1 % input2) != 0) {
			input1 = input2;
			input2 = swap;
		}
		
		System.out.println(input2);
	}
}
