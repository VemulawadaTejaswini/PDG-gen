import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int sum = L*N-N+(1+N)*N/2;
		int absMin = Math.abs(L);
		int bite = L;
		for (int i=2;i<=N;i++) {
			if (Math.abs(L+i-1)<absMin) {
				absMin = Math.abs(L+i-1);
				bite = L+i-1;
			}
		}
		System.out.println(sum-bite);
	}
}