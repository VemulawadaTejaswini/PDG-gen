import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long sum = 0;
    long M = Long.MIN_VALUE;
    long m = Long.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      long tmp = scan.nextLong();
      sum += tmp;
      M = Math.max(M,tmp);
      m = Math.min(m,tmp);
    }
    System.out.printf("%d %d %d\n",m,M,sum);
    scan.close();
  }
}

