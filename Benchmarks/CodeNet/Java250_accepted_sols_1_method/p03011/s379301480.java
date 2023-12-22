import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int ans = Math.min(p+q,q+r);
    ans = Math.min(ans,r+p);
    System.out.println(ans);
  }
}