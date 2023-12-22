//ABC81_B

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int C11 = scan.nextInt();
		int C12 = scan.nextInt();
		int C13 = scan.nextInt();
		scan.nextLine();

		int C21 = scan.nextInt();
		int C22 = scan.nextInt();
		int C23 = scan.nextInt();
		scan.nextLine();

		int C31 = scan.nextInt();
		int C32 = scan.nextInt();
		int C33 = scan.nextInt();
		scan.nextLine();


		if(((C12-C11)==(C22-C21)&&(C22-C21)==(C32-C31))
			&& ((C13-C12)==(C23-C22)&&(C23-C22)==(C33-C32))
			&& ((C31-C21)==(C32-C22)&&(C32-C22)==(C33-C23))
			&& ((C21-C11)==(C22-C12)&&(C22-C12)==(C23-C13)))
			{System.out.println("Yes");	}
		else
			{System.out.println("No"); }

	}
}