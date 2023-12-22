
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt(), b = scn.nextInt();
		int A,B,DEC;
		A = 0;
		B = 0;
		DEC = 1;
		for(int i = 0;i < b;i++) {
			A += DEC*a;
			DEC*=10;
		}
		DEC = 1;
		for(int i = 0;i < a;i++) {
			B += DEC*b;
			DEC*=10;
		}
		System.out.println((a<b)?A:B);
	}

}
