
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static int a,b,c,d,e,f;
	static int w,s;
	
	// ABC 074c 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 a = Integer.parseInt(sc.next()) * 100;
		 b = Integer.parseInt(sc.next()) * 100;
		 c = Integer.parseInt(sc.next());
		 d = Integer.parseInt(sc.next());
		
		 e = Integer.parseInt(sc.next());
		 f = Integer.parseInt(sc.next());
		 
		 
		 Set<Integer> w = new HashSet<Integer>();
		 Set<Integer> s = new HashSet<Integer>();
		 
		 for(int i = 0 ; i <= 30 ; i++) {
			 for(int j = 0 ; j <= 30 ;j++) {
				int wa = (a * i + b * j);
				if(wa > 3000 || wa == 0) {
					continue;
				}
				w.add(wa);
			 }
		 }
		 
		 for(int i = 0 ; i <= 3000 ;i++) {
			 for(int j = 0 ; j <= 3000 ;j++) {
				int su = c * i + d * j;
				if(su > 3000) {
					continue;
				}
				s.add(su);
			 }
		 }
		 
		 int ans1 = a;
		 int ans2 = 0;
		 
		 double temp = 0;
		 
		 for(int p : w) {
			 for(int q : s) {
				
				 if(p + q > f || p + q == 0) {
					 continue;
				 }
				 double den =(double)q / (p + q);
				// System.out.println(p+" "+q);
				// System.out.println(den +" "+((double)(e/(100+e))));
				 if(den > (double)e/(100+e)) {
					 continue;
				 }
				 if(den > temp) {
					
					 temp = den;
					 ans1 = p;
					 ans2 = q;
 				 }
				 
			 }
		 }
		 
		 System.out.println((ans1+ans2)+" "+ans2);
		 
	}
}