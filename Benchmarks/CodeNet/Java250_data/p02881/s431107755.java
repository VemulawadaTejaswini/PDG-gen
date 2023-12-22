import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long N = in.nextLong();
    for(long i = (long) Math.sqrt(N); i >= 0; i--) {
      if(N % i == 0) {
        System.out.println(i + N / i - 2);
        return;
      }
    }
  }
}