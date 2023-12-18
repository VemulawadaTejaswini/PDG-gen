import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long a[] = new long[N];
            long b[] = new long[N];
            long s[] = new long[N];
            long ans = 0;
            
            for(int i=0; i<N; i++) {
            	a[i] = sc.nextLong();
            	b[i] = sc.nextLong();
            	s[i] = a[i] + b[i];
            	ans -= b[i];
            }
            Arrays.sort(s);
            
            for(int i=N-1; i>=0; i-=2) {
            	ans += s[i];
            }
            System.out.println(ans);
        }
    }
}