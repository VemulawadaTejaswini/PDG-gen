import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    Long K = sc.nextLong();
    char ans;
    if(K == 1){
      ans = S.charAt(0);
    }else{
      int count = 0;
      for(int i=0; i<S.length(); i++){
        if(S.charAt(i) != '1') break;
        count++;
      }
      if(K <= count) ans = '1';
      else ans = S.charAt(count);
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}