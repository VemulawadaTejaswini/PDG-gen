import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			String a = sc.next();
			String b = sc.next();
			int an =Integer.parseInt(a);
			int bn =Integer.parseInt(b);
			
			
			String ab ="" ;
			String ba =""  ;
			

			
			for (int i=0;i<bn;i++) {
				ab += a;
			}
			
			
			for (int i=0;i<an;i++) {
				ba += b;;
			}
			
			
			
			if(ab.compareTo(ba)<0) {
				System.out.println(ab);
			}else {
				System.out.println(ba);
			}
			
		}
				
	}