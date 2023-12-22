import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int x = 0;
      int y = 0;
      for(int i = 0;i < n;i++){
        a[i] = sc.nextInt();
        y += a[i];
      }
      Arrays.sort(a);
      for(int i = n-1;i>=0;i -= 2){
      	x += a[i];
      }
      System.out.println(x*2-y);
    }
}