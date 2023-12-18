import java.util.*;
 
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
	     long a = sc.nextInt();
        long b = sc.nextInt();
      long c = sc.nextInt();
      long d = sc.nextInt();
      long ac = a*c;
      long bd = b*d;
      long ad = a*d;
      long bc = b*c;
      System.out.println(Math.max(Math.max(ac,bd),Math.max(ad,bc)));
		
	}
}