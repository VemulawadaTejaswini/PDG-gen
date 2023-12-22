import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    long ans;
    if(N % (A+B) < A)
      ans = N / (A+B) * A + N % (A+B);
    else
      ans = N / (A+B) * A + A;
    
    System.out.println(ans);
    
  }
}