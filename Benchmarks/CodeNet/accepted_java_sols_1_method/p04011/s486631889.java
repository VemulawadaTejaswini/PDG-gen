import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum;
    
    if(n <= k) {
      sum = n * x;
    } else {
      n = n - k;
      sum = k * x + n * y;
    }
    System.out.println(sum);
  }
}