import java.util.*;

public class Main {
		public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   
	   int N = sc.nextInt();
	     Integer a[] = new Integer[N];
			for (int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}
	Arrays.sort(a, Collections.reverseOrder());
	       int ans = 0;
	   
	   for(int i=0; i<N-1; i++ ) {
		   ans += a[i] - a[i+1];
	   }
	   System.out.println(ans);
		}
}