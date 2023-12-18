import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long lim = 1000000007;
      	long nums[] = new long[4];
      	long a = 1;
      	long b = 1;
      	long c = 1;
      	long ans;
  
      	for(int i = 0;i < n;i++) {
          a *= 10;
          b *= 8;
          c *= 9;
          a %= lim;
          b %= lim;
          c %= lim;
        }
      	ans = a + b - 2*c;
      	if(ans < 0) ans += lim;
      	else ans %= lim;
           
      	System.out.println(ans);
        
	}
}
