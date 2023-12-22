
import java.util.Scanner;



class Main {

	public static void main(String[] argv){

		Scanner sc = new Scanner(System.in);
		long A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		sc.close();
		
		long cutA = (A % 2) * B * C;
		long cutB = (B % 2) * A * C;
		long cutC = (C % 2) * A * B;
		
		System.out.println(Math.min(cutA, Math.min(cutB,cutC)));
		

	}


}

