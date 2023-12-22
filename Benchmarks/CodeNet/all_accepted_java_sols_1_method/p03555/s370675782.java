import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		
		if ( A[0] == B[2] && A[1] == B[1] && A[2] == B[0] ) 
			System.out.println("YES");
		else System.out.println("NO");
	}
}
