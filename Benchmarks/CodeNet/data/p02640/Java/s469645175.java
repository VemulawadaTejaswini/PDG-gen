import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		sc.close();
		/*
		2a+4b = Y
		a+b = X
		a+2b=Y/2
		a = Y/2 - 2b
		b-2b+Y/2 = X
		-b = X - Y/2
		;;b = Y/2 -X
		;;a = Y/2 - Y + 2X
		;;a = 2X - Y/2
		*/
		int a = Y/2 - X;
		int b = 2*X - Y/2;
		if(a>=0 && b>=0){
			System.out.println("Yes");
		}else if(a < 0 || b < 0){
			System.out.println("No");
		}
	}
}
