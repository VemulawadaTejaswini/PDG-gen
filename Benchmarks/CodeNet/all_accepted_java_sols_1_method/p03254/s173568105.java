import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      int count = 0;
      int x = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      long sum = 0;
      for (int i=0; i<a.length; ++i){
        sum = sum + a[i];
      }
      if(sum < x){
       System.out.println(n-1);
      }else if(sum == x){
        System.out.println(n);
      }else{
      Arrays.sort(a);
      for(int i=0; i<a.length; ++i){
        if(x>=a[i]){
          x = x - a[i];
          count = count + 1;
        }
      }
      System.out.println(count);
		}
    }
}
