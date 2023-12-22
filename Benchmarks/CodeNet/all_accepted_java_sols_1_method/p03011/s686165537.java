import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    int ans = Math.min(Math.min(P+Q,Q+R),R+P);
    System.out.println(ans);
  }
}
  