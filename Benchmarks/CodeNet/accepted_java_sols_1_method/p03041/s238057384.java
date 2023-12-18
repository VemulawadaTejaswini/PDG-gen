import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int M;
		M = sc.nextInt();
		String A;
		A = sc.next();
    A= A.substring(0,M-1)+A.substring(M-1,M).toLowerCase()+A.substring(M);
    
					System.out.print(A); 	

	}
}


