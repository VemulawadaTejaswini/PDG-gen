import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();
    t = t / a;
    int ans = b * t;
    System.out.println(ans);
  }
}
