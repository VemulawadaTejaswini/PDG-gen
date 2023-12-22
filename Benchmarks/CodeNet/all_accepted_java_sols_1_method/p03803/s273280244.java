

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt()+11;
		int B=sc.nextInt()+11;
		A=A%13;
		B=B%13;
		if(A>B) {
			System.out.println("Alice");
		}
		else if(B>A){
			System.out.println("Bob");
		}
		else {
			System.out.println("Draw");
		}
	}
}