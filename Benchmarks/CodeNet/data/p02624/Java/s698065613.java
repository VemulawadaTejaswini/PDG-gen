import java.math.*;
import java.util.*;

public class Main {
  	private static int[] factors;
  
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
  	  factors = new int[K];
      
      long ans = 1;
      factors[1] = 1;
      factors[2] = 2;
      factors[3] = 2;
      if (K <=3) {
        return factors[K];
      }
      
      for (int i = 4; i <= K; i++) {
      	ans += (i * f(i));
      }
      
      System.out.println(ans);
    }
  
  	private static long f(int num) {
      	double sqrt = Math.sqrt(num);
      	int iSqrt = (int) sqrt;
      	if (iSqrt * iSqrt == num) {
          // Pure square
          return factors[iSqrt] + 1;
        }
      
      	int count = 1;
 		for (int i = 2; i <= max; i++) {
        	if (num % i == 0) {
              count++;
            }
        }
      	factors[num] = count;
      	return count;
    }
}
