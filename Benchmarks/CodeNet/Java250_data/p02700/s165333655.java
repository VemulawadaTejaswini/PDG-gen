import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		do {
			C = C-B;
			if(C > 0) {
				A = A-D;
			}
		}while (A > 0 && C > 0);
				
		if(A > C) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		sc.close();
	}
}