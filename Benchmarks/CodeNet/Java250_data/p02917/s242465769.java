import java.util.Scanner;

public class Main {
	public static int ceil(int a, int b){
		int x = (a + (b - 1))/b;
		return x;
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N+1];
		int ans = 0;
		
		B[0] = (int)Math.pow(10, 6);
		B[N] = (int)Math.pow(10, 6);
		
		for(int i=1; i < N; i++) {
			B[i] = sc.nextInt();
	    }
		for(int i=0; i < N; i++) {
			ans += Math.min(B[i], B[i+1]);
	    }
		System.out.println(ans);
	}
}