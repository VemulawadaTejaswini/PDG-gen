import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] b = new int[n];
      int count = 0;
      for(int i = 0;i < n;i++){
      	a[i] = sc.nextInt();
      }
      for(int i = 0;i < n;i++){
      	while(a[i]/2 == (double)a[i]/2){
          b[i]++;
          a[i] = a[i]/2;
        }
      }
      for(int i = 1;i < n;i++){
      	b[i] = Math.min(b[i],b[i-1]);
      }
      System.out.println(b[n-1]);
    }
}
