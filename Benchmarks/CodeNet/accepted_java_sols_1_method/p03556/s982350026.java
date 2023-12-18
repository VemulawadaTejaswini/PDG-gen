import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int hoge = (int)Math.sqrt(N);
    int ans = (int)Math.pow(hoge,2);
    System.out.println(ans);
  }
}
