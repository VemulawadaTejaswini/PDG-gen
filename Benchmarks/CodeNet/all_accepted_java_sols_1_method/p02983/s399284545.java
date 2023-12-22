import java.util.Scanner;

public class Main {

	private static final int k = 2019;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
      	int R = sc.nextInt();
      	
      	if (L == 0) {
      		System.out.println(0);
      		return ;
      	}
      	
      	if (R - L > 2018) {
      		System.out.println(0);
      		return;
      	}
      	
      	int res = Integer.MAX_VALUE;
      	L = L % k;
      	R = R % k;
      	
      	if (L > R) {
      		System.out.println(0);
      		return;
      	}
      	
        for (int i = L; i <= (R-1); i++) {
      		for (int j = i+1; j <= R; j++) {
      			int candidate = (i%k)*(j%k)%k;
      			res = Math.min(res, candidate);
      		}
        }
      	
      	
      	System.out.println(res);
		sc.close();
	}
}