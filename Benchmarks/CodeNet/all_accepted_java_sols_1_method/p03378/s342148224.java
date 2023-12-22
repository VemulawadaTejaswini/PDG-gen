import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int x = sc.nextInt();
      int[] a = new int[m];
      for(int i = 0;i < m;i++)a[i] = sc.nextInt();
      int sum1 = 0;
      int sum2 = 0;
      int x1 = x;
      int x2 = x;
      for(int i = 0;i<m;i++){
      	if(a[i]<x)sum1++;
      }
      for(int i = 0;i < m;i++){
      	if(x<a[i])sum2++;
      }
      System.out.println(Math.min(sum1,sum2));
    }
}