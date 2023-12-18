import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    long ans = 0;
    if((b-a)%2 == 0){
      ans = (b-a)/2;
    }else{
      long x = a + ((b-a)-1)/2;
      long y = (N-b+1) + (N-(a+(N-b+1)))/2;
      ans = Math.min(x, y);
    }
    System.out.println(ans);
  }
}