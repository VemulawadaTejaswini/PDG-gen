import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	long[] a = new long[n];
        long std = 1000000000000000000L;
      	for (int i=0; i < n; i++) {
          a[i]= sc.nextLong();
          if (a[i] == 0) {
            System.out.println(0);
            return;
          }
        }
      
        long seki = a[0];
        for(int i=1; i < n; i++) {
          if (a[i] <= (std / seki)) {
            seki *= a[i];
          } else {
            System.out.println(-1);
          	return;
          }
        }
        System.out.println(seki);
    }
}