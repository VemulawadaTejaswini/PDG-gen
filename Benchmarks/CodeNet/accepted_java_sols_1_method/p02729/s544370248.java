import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int ans = (n * n + m * m - n - m) / 2;

    System.out.println(ans);
  }
}
