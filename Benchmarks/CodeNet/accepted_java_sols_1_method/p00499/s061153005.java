import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int cnt = 0;
		
		while(true) {
			if(A <= 0 && B <= 0) {
				break;
			} else {
				A-=C;
				B-=D;
				cnt++;
			}
		}
		
		System.out.println(L - cnt);
	}
}