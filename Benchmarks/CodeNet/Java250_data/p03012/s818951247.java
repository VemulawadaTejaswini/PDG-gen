import java.util.*;
public class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);

    int N  = sc.nextInt();
    int[] re = new int[N];
    for(int i = 0;i<N;i++)
    {
    	  re[i] = sc.nextInt();
    }
    int sum =0;
    for(int i = 0;i<N;i++)
    {
    	  sum += re[i];
    }
    int hsum = 0;
    int min = sum;
    int ans = 0;
    for(int i = 1;i<N;i++)
    {
      hsum =0;
      for(int k = 0; k <=i;k++)
      {
          hsum+=re[k];
      }
      if(min > Math.abs(sum-2*hsum))
      {
       	min = Math.abs(sum-2*hsum);
      }
      else break;
    }

   	System.out.println(min);
 }
}