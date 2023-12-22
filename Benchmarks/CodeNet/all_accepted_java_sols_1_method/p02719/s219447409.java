import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long k = sc.nextLong();
      long[] a = new long [2];
      long div = 0;
      div = n / k;
      a[0] = k * div;
      a[1] = k * (div+1);

      long min = n;
      if( n - a[0] >= 0 && n - a[0] < min ){
        min = n - a[0];
      }
      if( a[1] - n >= 0 && a[1] - n < min ){
        min = a[1] - n;
      }
      System.out.println(min);
	}
}