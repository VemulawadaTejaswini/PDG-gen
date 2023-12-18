import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    scan.close();

    long ans = N+1;
    long tmp = 0;
    double max= Math.sqrt(N);
    for(long i=2; i<=max; i++) {
      tmp = N/i;
      if(N%i == 0) {
        ans = tmp+i;
      }
    }

    System.out.println(ans-2);
  }
}