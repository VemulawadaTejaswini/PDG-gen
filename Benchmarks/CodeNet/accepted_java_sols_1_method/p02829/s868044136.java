import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int A,B;
		do {
			A = stdIn.nextInt();
			B = stdIn.nextInt();
	}while((A<1||A>3)&&(B<1||B>3));
		int x = 0;
		switch(A) {
		case 1: if(B==2) {
			x = 3;
			break;
		}else {
			x = 2;
			break;
		}
		case 2 : if(B == 1) {
			x = 3;
			break;
		}else {
			x = 1;
			break;
		}
		case 3 : if(B==1) {
			x = 2;
			break;
		}else {
			x = 1;
			break;
		}
		}
		System.out.println(x);
	}
}
