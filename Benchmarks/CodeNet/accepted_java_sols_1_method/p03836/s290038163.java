import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int sx  = sc.nextInt();
			int sy  = sc.nextInt();
			int tx  = sc.nextInt();
			int ty  = sc.nextInt();
		sc.close();
		for(int i = sx ; i < tx ; i++){

			System.out.print("R");
		}
		for(int i = sy ; i < ty ; i++){

			System.out.print("U");
		}

		for(int i = sx ; i < tx ; i++){

			System.out.print("L");
		}
		for(int i = sy ; i < ty ; i++){

			System.out.print("D");
		}
		int sx2 = sx-1;
		int sy2 = sy-1;
		int tx2 = tx+1;
		int ty2 = ty+1;


		System.out.print("D");

		for(int i = sx; i < tx2 ; i++){

			System.out.print("R");
		}
		for(int i = sy2; i < ty ; i++){

			System.out.print("U");
		}

		System.out.print("LU");
		for(int i = sx2; i < tx ; i++){

			System.out.print("L");
		}
		for(int i = sy; i < ty2 ; i++){

			System.out.print("D");
		}

		System.out.print("R");

		//System.out.println(m);
	}
}