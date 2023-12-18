import java.io.*;
import java.util.Scanner;

public class Main {

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
	  					return Math.sqrt((this.x-another.x)*(this.x-another.x)+(this.y-another.y)*(this.y-another.y))<this.r+another.r;
	  					  				
	  			}
	  	
	  
  }

		private void cal() throws IOException{
			
			for(;;){	
				int n=sc.nextInt();
				if(n==0)
					break;
				
				circle[] circles=new circle[n];
				int[] coverbit=new int[n];
				
				for(int i=0;i<n;i++){
					circles[i]=new circle(sc);
					
					for(int j=i-1;j>=0;j--)
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
						


					
				}
				
						System.out.println(Integer.toString(Max));
				
			}
		}

	public static void main ( String [] args ) throws IOException{
    	
	  new Main().cal();
    }
	
    
}