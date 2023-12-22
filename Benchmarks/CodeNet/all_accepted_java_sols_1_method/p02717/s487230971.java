import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan01 = new Scanner(System.in);

		int numbox[] = new int[3];
		for(int i=0; i<3; i++){
			numbox[i] = scan01.nextInt();
		}

		int num;
		num = numbox[1];
		numbox[1] = numbox[0];
		numbox[0] = numbox[2];
		numbox[2] = num;

		System.out.println(numbox[0]);
		System.out.println(numbox[1]);
		System.out.println(numbox[2]);

		scan01.close();
	}

}