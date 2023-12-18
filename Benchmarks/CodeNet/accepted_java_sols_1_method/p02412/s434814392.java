import java.util.Scanner;
	class Main {
	public static void main(String[] args){
        
		Scanner s = new Scanner(System.in);
		int i,j,k,n,x,count=0;
        boolean sw=false;
        
                  n=s.nextInt();
      			  x=s.nextInt();
        
        if(n==0&&x==0)
            sw=true;
        
        while(sw==false){
            
              for(i=1;i<=n-2;i++)
           		 for(j=i+1;j<=n-1;j++)
            	      for(k=j+1;k<=n;k++)
                         if(i+j+k==x)count++;
                         

                
  			 System.out.println(count);
            
            n=s.nextInt();
      		x=s.nextInt();
            count=0;
            if(n==0&&x==0)
            	sw=true;
        }
	}
}
