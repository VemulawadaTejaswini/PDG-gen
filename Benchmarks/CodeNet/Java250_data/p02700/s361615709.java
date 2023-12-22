import java.util.Scanner;

public class Main {
	static int A;
	static int B;
	static int C;
	static int D;
	static int a=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		fight();
	}
	static void fight() {
		C=C-B;
		if(C<=0) {
			System.out.println("Yes");
		}
		else {
			A=A-D;
			if(A<=0) {
				System.out.println("No");
			}
			else {
				fight();
			}
		}
	}
}