import java.util.*;
 
public class Main {
	public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      
      for(int i= 0; i<n; i++){
        arr[i] = sc.nextLong();
      }
      long prod = 1;
      long[] prodArr = new long[n];
      for(int i=n-1; i>=0; i--){
        prod *= arr[i];
        prodArr[i] = prod;
      }
      boolean pairWise = true;
      boolean setWise = true;
      long setGCD = gcd(arr[0], arr[1]);
      for(int i=0; i<n-1; i++){
        long cur = arr[i];
        long next = arr[i+1];
        long nextProd = prodArr[i+1];
        if(gcd(cur, nextProd) != 1) pairWise = false;
        if(i>=2) setGCD = gcd(setGCD, cur);
      }
      if(pairWise) System.out.println("pairwise coprime");
      else if(setGCD == 1) System.out.println("setwise coprime");
      else System.out.println("not coprime");
	}
  public static long gcd(long a, long b){
    if(b==0) return a;
    return gcd(b, a%b);
  }
}