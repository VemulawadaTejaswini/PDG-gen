import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  A = sc.nextInt();
		int  B = sc.nextInt();
		
		if(A >= 13)
		{
			System.out.println(B);
		}else if( 6 <= A && A <= 12)
		{
			int C = B /2;
			System.out.println(C);
		}else
		{
			int D = 0;
			System.out.println(D);
		}
	}
}