import java.util.Scanner;
import java.math.BigDecimal;

public class Main{


		public static long saidai(long a , long b){
			long c,s,t;
			s = a;
			t = b;
			while(true){
				if(s == t){
					c = s;
					break;
				}else if(s == 0){
					c = t;
					break;
				}else if(t == 0){
					c = s;
					break;
				}else if(s > t){
					s = s % t;
				}else{
					t = t % s;
				}
				
			}
			
			
			return c;
		}
		
		public static  long saishou(long a , long b){
			long c,s,t;
			s = a;
			t = b;
			while(true){
				if(s == t){
					c = s;
					break;
				}else if(s < t){
					s = s+a;
				}else{
					t = t+b;
				}
			
			}
			return c;
		}
		
       public static void main(String[] args){
       int i,j;
       long a,b,c,d,e,f;
       
    	long[] x = new long[60];
    	long[] y = new long[60];
    
        Scanner scan = new Scanner(System.in);
        
        i = 0;
        while(scan.hasNextLong()){
        	a = scan.nextLong();
        	b = scan.nextLong();
        	x[i] = saidai(a,b);
        	y[i] = saishou(a,b);
        	
        	i++;
        
        }
      
        
        j = 0;
        while(j < i){
        	
     		System.out.println(x[j] + " " + y[j]);
        	j++;
       		}
       		}
}