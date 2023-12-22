import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int max = 0;
      int min = 10000;
      for(int i = 0;i < n;i++){
      	a[i] = sc.nextInt();
        max = Math.max(a[i],max);
        min = Math.min(a[i],min);
      }
      System.out.println(max-min);
    }
}