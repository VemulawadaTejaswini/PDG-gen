import java.util.*;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
      	long tmp = 1;
      	int sum = 0;
      	
      	while(N > 1){
          for (long i = tmp+1; i <= N; i++) {
            if (N % i == 0) {
              //System.out.println(i);
              tmp = i;
              sum += 1;
              N= N / tmp;
              break;
            }
          }
        }

      	System.out.println(sum);
    }
}