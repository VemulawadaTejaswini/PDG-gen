import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int K = sc.nextInt();
    int i=1, ans =0;
    while (true) {
      if ((long)N < Math.pow(K,i)) { 
        ans = i;
        break;
      }
      i++;
    }
    System.out.println(ans);
  }
}