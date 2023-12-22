import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		String stra = String.valueOf(a);
		String strb = String.valueOf(b);
		String A = stra;
		String B = strb;
		for (int i=1; i<b; i++)
			A = A.concat(stra);
		
		for (int i=1; i<a; i++)
			B = B.concat(strb);
		
		if (A.compareTo(B) < 0)
			System.out.print(A);
		else
			System.out.print(B);

		
		sc.close();

	}
}
