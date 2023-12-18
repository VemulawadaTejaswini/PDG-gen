import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[M];
		for(int i = 0;i < M;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int route0 = 0;
		int routeN = 0;
		Arrays.sort(A);
		for(int i = 0;i < M;++i) {
			if(A[i] < X)
				route0++;
			else
				routeN++;
		}
		if(route0 > routeN)
			System.out.println(routeN);
		else
			System.out.println(route0);
	}
}
