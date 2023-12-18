import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	BigInteger a[] = new BigInteger[N];
        for (int i=0; i<N; i++) {
            a[i] = BigInteger.valueOf(sc.nextInt());
        }
      
      	Arrays.sort(a, Collections.reverseOrder());
      	BigInteger ans = BigInteger.ZERO;
      
      	for (int i=1; i<N-1; i++) {
            ans = ans.add(a[i-1]);
        }
      	ans = ans.add(a[1]);
      
       	System.out.println(ans);
    }
}