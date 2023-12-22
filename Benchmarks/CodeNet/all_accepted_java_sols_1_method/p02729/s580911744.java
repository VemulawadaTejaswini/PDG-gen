import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    int m = sc.nextInt();
    int res = 0;
    if(m > 1) res += m * (m - 1) / 2;
    if(n > 1) res += n * (n - 1) / 2;
    System.out.println(res);
  }
}