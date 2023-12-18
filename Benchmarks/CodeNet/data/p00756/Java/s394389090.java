import java.io.*;
import java.util.Scanner;

public class disc {

	private static Scanner sc = new Scanner(System.in);

		class circle{
			int x;
			int y;
			int r;
			int c;
	  			
	  			circle(Scanner sc){
	  				this.x=sc.nextInt();
	  				this.y=sc.nextInt();
	  				this.r=sc.nextInt();
	  				this.c=sc.nextInt();
	  		}
	  			
	  			Boolean isCoveredBy(circle another){
	  					return Math.sqrt((this.x-another.x)^2+(this.y-another.y)^2)<this.r+another.r;
	  					  				
	  			}
	  	
	  
  }

		private String cal() throws IOException{
			
			for(;;){	
				int n=sc.nextInt();
				if(n==0)
					break;
				
				circle[] circles=new circle[n];
				int[] coverbit=new int[n];
				
				for(int i=0;i<n;i++){
					circles[i]=new circle(sc);
					
					for(int j=0;j<i;j--)
						if(circles[i].isCoveredBy(circles[j]))
							coverbit[i]|=(1<<j);
				}
				
				int Max=0;
				boolean PossibleBit[]=new boolean[1<<n];
				PossibleBit[0]=true;
				
				for(int i=0;i<(1<<n);i++){
					
					if(!PossibleBit[i])
						continue;
					
					Max=Math.max(Integer.bitCount(i),Max);
					
					for(int first=0;first<n;first++){
						if((~i & coverbit[first])!=0 || (i&1<<first)!=0) 
							continue;
						
						for(int second=first+1;second<n;second++){
							if((~i & coverbit[second])!=0 || (i&1<<second)!=0)
								continue;
							if(circles[first].c!=circles[second].c)
								continue;
							
							PossibleBit[i|(1<<first)|(1<<second)]=true;
						}
					
					}
						


					return Integer.toString(Max);
					
				}
				
				
			}
			return null;

		}
	  
	public static void main ( String [] args ) throws IOException{
    	
	  new disc().cal();
    }
	
    
}