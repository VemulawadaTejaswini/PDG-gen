import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
	String A = sc.next();
    String B = sc.next();
      int count =0;
      for(int i=0;i<3;i++){
       if(A.substring(i,i+1).equals(B.substring(i,i+1))) {
         count++;
       }
      }
      

 
      System.out.println(count);
    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}