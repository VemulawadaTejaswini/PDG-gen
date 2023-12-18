import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int L = Integer.parseInt(sc.next());
    int ans = 0;
    int a = 10000;
    int b = 0;
    for(int i = 0; i < N; i++){
      ans += L+i;
      if(Math.abs(L+i) < a){
        a = Math.abs(L+i);
        b = L+i;
      }
    }
    ans -= b;
    System.out.println(ans);
  }
}