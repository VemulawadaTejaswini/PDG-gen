import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int t = sc.nextInt();
      int[] a = new int[t];
      int sum = 0;
      int max = 0;
      for(int i = 0;i < t;i++){
        a[i]=sc.nextInt();
        sum+=a[i];
        max = Math.max(max,a[i]);
      }
      sum -=max;
      if(max-1<=sum)System.out.println(0);
      else System.out.println(max-1-sum);
    }
}