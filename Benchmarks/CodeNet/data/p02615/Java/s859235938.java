import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
      int[] a = new int[n];
      for(int i=0; i<n; i++){
      	a[i] = sc.nextInt();
      }
      
      Arrays.sort(a);
      
      int r=a[n-1];
      
      for(int i = n-2; i >= 1; i--){
        if(a[i+1] == a[i]){
          r += a[i+1];
        } else {
          r += a[i];
        }
      }
      
      
      	System.out.println(r);
    }
}