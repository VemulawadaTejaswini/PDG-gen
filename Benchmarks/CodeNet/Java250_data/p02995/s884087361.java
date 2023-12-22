import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        long size = b-a + 1;
        long numOfRemoved= 0;
       
        long numOfMultiplyC = b / c - (a -1) / c;
        long numOfMultiplyd = b / d - (a-1) / d;

        long x = c * d / gcd(c, d);
        long numOfMultiplycd = b / x - (a-1) / x;
        
        System.out.println(size - numOfMultiplyC - numOfMultiplyd + numOfMultiplycd);
    }
    

      
    private static long gcd(long m, long n) {
      if(m < n) return gcd(n, m);
      if(n == 0) return m;
      return gcd(n, m % n);
  }
}