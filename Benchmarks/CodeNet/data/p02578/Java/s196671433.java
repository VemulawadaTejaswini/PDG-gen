import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    
    for (int i = 0; i < N; i++) {
      long height = sc.nextLong();
      if (height(i) <= height(i - 1)) {
        long sa = height(i - 1) - height(i);
        height(i) += sa;
        sum += sa;
      } 
    }
    System.out.println(sum);
  }
}
      