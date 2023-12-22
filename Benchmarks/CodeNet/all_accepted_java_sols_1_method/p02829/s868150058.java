
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();

			int R = A == 1 ? (B==2 ? 3: 2) : (A==2 ? ( B==1 ? 3:1) : (B==2?1:2));
			
			
			System.out.println(R);
	}	
}