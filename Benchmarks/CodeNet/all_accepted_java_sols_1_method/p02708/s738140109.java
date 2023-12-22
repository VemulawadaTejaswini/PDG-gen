import java.util.*;

public class Main{
    public static void main(String[] args){
      final long mod = 1000000007;
	Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long number = 0;
    for(long i = K ; i <= N + 1 ; i++){
      long max = (N + (N - i + 1)) * i / 2;
      long min = (0 + i - 1) * i / 2;
      number += (max - (min - 1));
        number %= mod;
    }
      System.out.println(number);
        
	
	}
}