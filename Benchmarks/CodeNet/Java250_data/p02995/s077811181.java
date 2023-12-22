import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		Long A = sc.nextLong() - 1;
      Long B = sc.nextLong();
      Long C = sc.nextLong();
      Long D = sc.nextLong();
      Long CDkaburi = lcm(C,D);
      
      
      Long AC = A / C;//1
      Long AD = A / D;//1
      Long ACD = A / CDkaburi;//0
      Long Awarenai = A - (AC + AD) + ACD;//8
      
      Long BC = B / C;//6
      Long BD = B / D;//5
      Long BCD = B / CDkaburi;//0
      Long Bwarenai = B - (BC + BD) + BCD;
      System.out.println(Bwarenai - Awarenai);
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
