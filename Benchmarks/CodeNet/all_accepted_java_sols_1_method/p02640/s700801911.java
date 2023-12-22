import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int X = sc.nextInt();
		final int Y = sc.nextInt();
		sc.close();
		if (Y % 2 == 1) {
			System.out.println("No");
			return;
		}
		int a = Y/2 - X;
		int b = 2*X - Y/2;
		if(a>=0 && b>=0){
			System.out.println("Yes");
		}else if(a < 0 || b < 0){
			System.out.println("No");
		}
	}
}
