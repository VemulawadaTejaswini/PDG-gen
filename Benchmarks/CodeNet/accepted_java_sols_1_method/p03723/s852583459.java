import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int i = 0;
		for(; i<100; i++) {
			if(A%2!=0 || B%2!=0 || C%2!=0)
				break;
			
			int na = B/2+C/2;
			int nb = C/2+A/2;
			int nc = A/2+B/2;
			A = na;
			B = nb;
			C = nc;
		}
		
		System.out.println(i<100 ? i : -1);
		sc.close();
	}
}
