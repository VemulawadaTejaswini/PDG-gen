import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    r = Math.min(r,(l+2019));
    long mod = 2019L;
    long ans = (long)Math.pow(10,9)+7;
    for(long i = l; i < r; i++){
        for(long j = i+1; j <= r; j++){
            long tmp = ((i%mod)*(j%mod))%mod;
            ans = Math.min(ans,tmp);
        }
    }
    System.out.println(ans);
  }
}