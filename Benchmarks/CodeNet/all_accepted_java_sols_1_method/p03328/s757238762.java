import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int i=1;
      int n = b-a;
      int hi=0;
      while(i<=n){
        hi = hi += i;
        i++;
      }
      System.out.println(hi-b);
  }
}
