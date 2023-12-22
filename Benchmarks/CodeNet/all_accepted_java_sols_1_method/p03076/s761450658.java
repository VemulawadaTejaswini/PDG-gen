import java.util.*;

public class Main{
  static int[] ans;
  static Map<Integer, Integer> map;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int D = Integer.parseInt(sc.next());
    int E = Integer.parseInt(sc.next());
    
    int n = 10;
    if(A%10 != 0){
      n = n > A%10 ? A%10 : n;
      A = A+ 10-A%10;
    }
    if(B%10 != 0){
      n = n > B%10 ? B%10 : n;
      B = B+ 10-B%10;
    }
    if(C%10 != 0){
      n = n > C%10 ? C%10 : n;
      C = C+ 10-C%10;
    }
    if(D%10 != 0){
      n = n > D%10 ? D%10 : n;
      D = D+ 10-D%10;
    }
    if(E%10 != 0){
      n = n > E%10 ? E%10 : n;
      E = E+ 10-E%10;
    }
    
    n = 10-n;
    int ans = A+B+C+D+E-n;
    System.out.println(ans);
  }
}