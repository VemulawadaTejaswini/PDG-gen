import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] x = new long[n];
    int ans = 0;
    for(int i=0; i<n; i++){
      a[i] = sc.nextLong();
    }
    x[0] = a[0];
    for(int i=1; i<n; i++){
      long y = a[i]-x[i-1];
      if(y>=0){
        x[i] = a[i]; 
      }
      else{
        x[i] = a[i]+Math.abs(y);
        ans += Math.abs(y);
      }
    }
    System.out.println(ans);
  }
}