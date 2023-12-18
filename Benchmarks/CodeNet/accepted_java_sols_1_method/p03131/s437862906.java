import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    long B = sc.nextLong();
    long ans = 1;
    if(A >= B){
      ans += K;
    }else if(B-A == 1){
      ans += K;
    }else{
      K -= A-1;
      ans += A-1;
      ans += (K/2)*(B-A);
      if(K%2 == 1){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
