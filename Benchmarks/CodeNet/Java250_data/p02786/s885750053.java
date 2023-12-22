import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			long h = sc.nextLong();
			long h2 = h;
			int num = 0;
			long sum = 0;
			
			
			while(h2 >0 ) {
				h2 = h2/2;
				num++;
			}
			
			for(int i=0;i<num;i++) {
				sum += Math.pow(2, i);
			}
			
			System.out.println(sum);
			
		}
				
	}