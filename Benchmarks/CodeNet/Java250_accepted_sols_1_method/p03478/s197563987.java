import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int total =0;
    for (int i=0; i<N+1; i++) {
      int sum =0; 
      int a =i;
      while (a > 0) {
        sum += a % 10;
        a /= 10;
      }
      if (sum >= A && sum <= B) total += i;
    }
    System.out.println(total);
  }
}