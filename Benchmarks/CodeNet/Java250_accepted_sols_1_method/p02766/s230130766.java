import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int buf = 1;
    int ans = 0;

    while(buf <= n){
      buf *= k;
      ans += 1;
    }

    System.out.println(ans);
  }
}
