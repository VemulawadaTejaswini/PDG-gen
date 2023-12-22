import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int q = sc.nextInt();
    int r = sc.nextInt();
    int ma = Math.max(p,q);
    ma = Math.max(ma,r);
    System.out.println(p+q+r-ma);
  }
}
