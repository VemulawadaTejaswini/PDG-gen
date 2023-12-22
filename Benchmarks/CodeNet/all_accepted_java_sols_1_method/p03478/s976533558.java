import java.util.*;
 
public class Main {
  public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      int tmp = 0;
      int tmp1 = i;
      while (tmp1 > 0) {
        tmp += tmp1%10;
        tmp1 /= 10;
      }
      if (A <= tmp && tmp <= B) sum+=i;
    }
    System.out.println(sum);
  }
}
    