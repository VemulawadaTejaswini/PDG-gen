import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		 
		int L = 0;
		int R = 0;

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();

		L = A + B;
		R = C + D;

		if(L > R) {

			System.out.println("Left");
		
		}else if(L == R) {


			System.out.println("Balanced");
		
		}else if(R > L) {

			System.out.println("Right");
		
		}
	}
}