import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] a = new int[n];
      long sum = 0;
      long count = 0;
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        sum += a[i];
      }
      for(int i=0;i<n;i++){
        if( a[i] * 4 * m >= sum ){
          count++;
        }
      }
      if( m > count ){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      } 
	}
}