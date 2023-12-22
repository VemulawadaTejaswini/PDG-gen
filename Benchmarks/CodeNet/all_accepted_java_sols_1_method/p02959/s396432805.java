import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      long[] a = new long[n+1];
      long[] b = new long[n];
      for(int i=0;i<n+1;i++){
        a[i] = scan.nextLong();
      }
      for(int i=0;i<n;i++){
        b[i] = scan.nextLong();
      }
      
      long result=0;
      for(int i=n-1;i>=0;i--){
        long x = a[i+1]>b[i]?b[i]:a[i+1];
        a[i+1] -= x;
        b[i]-=x;
        result +=x;
        if(b[i]>0){
          long y = a[i]>b[i]?b[i]:a[i];
          a[i] -= y;
          b[i]-=y;
          result +=y;
        }
      }
      System.out.println(result);
	}
}