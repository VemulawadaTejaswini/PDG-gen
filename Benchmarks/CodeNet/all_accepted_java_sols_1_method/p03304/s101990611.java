import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();

    float ans = d == 0
      ? (float)(m-1)/n
      : (float)((long)(m-1)*(n-d)*2)/((long)n*n);
    
    System.out.println(ans);
  }
}