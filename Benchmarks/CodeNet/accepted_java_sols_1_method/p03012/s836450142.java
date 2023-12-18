import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		int[] w = new int[n];
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			w[i] = sc.nextInt();
			sum += w[i];
		}
		
		int ans = Integer.MAX_VALUE;
		int psum = 0;
		for(int i=0; i<n-1; i++) {
			psum += w[i];
			ans = Math.min(ans, Math.abs(psum - (sum - psum)));
		}
			
        out.println(ans);
    }
}
