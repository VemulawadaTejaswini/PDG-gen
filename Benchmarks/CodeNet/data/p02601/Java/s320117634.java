import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int K = sc.nextInt();
			int count = 0;
		
			while(A>=B) {
				B *= 2;
				count++;
			}
			
			while(B>=C) {
				C *=2;
				count++;
			}
			
			if(count <= K) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}	
	}
}
