import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	long x = scn.nextLong();
      long num = 0;
      long ans = 0;
      long[] a = new long[1000000];
      for(int i=0; i<a.length; ++i){
        a[i]= num * num;
        num = num +1;
      }
      for(int i=0; i<a.length; ++i){
        if(x>=a[i]){
          ans = a[i];
        }
      }
      System.out.println(ans);
	}
}
