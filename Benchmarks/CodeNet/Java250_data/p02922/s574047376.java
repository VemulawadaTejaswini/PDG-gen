import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int SUM = A;
		int ANS = 1;
		for ( ; SUM<B; ANS++) {
			SUM += A-1;
		}
		if(B==1) ANS=0;
		System.out.println(ANS);
	}
}