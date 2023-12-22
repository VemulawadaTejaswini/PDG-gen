import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int a = 1;
    int ans = 0;
    while (a < B){
      a += (A-1);
      ans++;
    }
    System.out.println(ans);
  }
}
