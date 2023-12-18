import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long ans = 0;
		
		long rest = 0;
		for(int i=0; i<N; i++) {
			long A = sc.nextLong();
			ans += (A+rest)/2;
			if(A>0 && (A+rest)%2==1)
				rest = 1;
			else
				rest = 0;
		}
		
		
		System.out.println(ans);
		
		sc.close();
	}
}
