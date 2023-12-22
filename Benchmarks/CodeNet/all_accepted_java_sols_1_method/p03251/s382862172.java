import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[] A = new int[N], B = new int[M];
		int X = sc.nextInt(), Y = sc.nextInt();
		for (int i=0; i<A.length; i++){
			A[i] = sc.nextInt();
		}
		for (int i=0; i<B.length; i++){
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		boolean ok = false;
		if (X<B[0] && Y>=B[0]){
			if (B[0]>A[A.length-1]){
				ok = true;
				System.out.println("No War");
			}
		}
		if (!ok){
			System.out.println("War");
			
		}

	}

}
