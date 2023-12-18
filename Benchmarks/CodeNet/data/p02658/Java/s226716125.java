import java.util.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long a[] = new long[N];
      	BigInteger ans = BigInteger.ONE;
      	double sum = Math.pow(10,18);
      	long sum2 = (long)sum;
        for (int i=0; i<N; i++) {
            a[i] = sc.nextLong();
          	//ans = ans * a[i];
          	ans = ans.multiply(BigInteger.valueOf(a[i]));
        }
      	//BigInteger sum3 = new BigInteger(sum);
      	long ans2 = ans.longValue();
        //if(ans.compareTo(sum2) = 1){
      	if(ans2 > sum2 || ans2 < 0){
          System.out.println("-1");
        }
        else {
          System.out.println(ans2);
        }
      	//System.out.println(ans2);
    }
}