import java.util.*;
 
public class Main {
  public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[] A = new Integer [N];
		int count;
		String ans;
		int sumA = 0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			A[i] = a;
			sumA += a;
		}
		Arrays.sort(A,Collections.reverseOrder());
		if (A[M-1] >= ((double)(double)sumA/(4*(double)M))) {
      ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
  }
}