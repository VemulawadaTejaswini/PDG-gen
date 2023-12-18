import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int sum = L*N + (N*(N-1))/2;
		
		if(L>0)
			sum -= L;
		else if(L+N-1<0)
			sum -= L+N-1;
		
		System.out.println(sum);
		sc.close();
	}
}
