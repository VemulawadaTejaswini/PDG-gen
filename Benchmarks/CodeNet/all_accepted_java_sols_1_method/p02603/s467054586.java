import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long money = 1000;
		long stock = 0;
		
		for(int i=0; i<N; i++) {
			if(i<N-1 && A[i]<A[i+1]) {
				long buy = money/A[i];
				money -= buy*A[i];
				stock += buy;
			} else {
				money += stock*A[i];
				stock = 0;
			}
		}
		
		System.out.println(money);
		
		sc.close();

	}
	
}
