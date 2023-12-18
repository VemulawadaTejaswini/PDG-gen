import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Turu = Y / 2 - X;
		if((1<=X)&&(X<=100)) {
			if((1<=Y)&&(Y<=100)) {
		if(Turu > X) {
			System.out.println("No");
		}else if (Turu < 0) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		}
		}
		sc.close();
	}

}