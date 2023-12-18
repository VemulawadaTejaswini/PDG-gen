import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int A = 0, B = 0;
    for(int i = (int)Math.sqrt(N); i >= 1 ; i--){
      if(N%i == 0){
        A = i;
        B = (int)(N/i);
        break;
      }
    }
    
    int C = A > B ? A : B;
    int ans = 0;
    while(C > 0){
      C /= 10;
      ans++;
    }
    System.out.println(ans);
  }
}
