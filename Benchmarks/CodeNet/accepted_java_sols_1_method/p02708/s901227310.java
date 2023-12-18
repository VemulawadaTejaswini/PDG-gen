import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long k = sc.nextInt();
    //long sum = (n*(n+1))/2;
    //System.out.println(sum);
    long ans =0;
    for(long i=k;i<=n+1;i++){
      long max = (n*(n+1))/2 - ((n-i)*(n-i+1))/2;
      long min = (i*(i-1))/2;
      long value = max-min+1;
      ans = ans+value%1000000007;
    }
    ans = ans%1000000007;
    System.out.println(ans);
  }
}