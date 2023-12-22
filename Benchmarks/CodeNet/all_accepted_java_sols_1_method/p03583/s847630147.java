import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans1 = 0;
    long ans2 = 0;
    long ans3 = 0;
    for(long i = 1; i <= 3500; i++) {
      for(long j = i; j <= 3500; j++) {
        if(((4 * i * j - n * i - n * j) > 0) && ((n * i * j) % (4 * i * j - n * i - n * j) == 0)) {
          ans1 = i;
          ans2 = j;
          ans3 = (n * i * j) / (4 * i * j - n * i - n * j);
          break;
        }
      }
      if(ans1 > 0) break;
    }
    System.out.print(ans1 + " ");
    System.out.print(ans2 + " ");
    System.out.print(ans3);
  }
}