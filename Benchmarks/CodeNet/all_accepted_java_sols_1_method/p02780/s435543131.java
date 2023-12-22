import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
	
  		int[] p=new int[n];
		for(int c=0;c<n;c++){
    		p[c]=sc.nextInt();
    	}
  		int[] p1=new int[n+1];
  		p1[0]=0;
  		for(int d=0;d<n;d++){
        	p1[d+1]=p1[d]+p[d];
        }
  		double max=0;
  		double kari=0;
  		
  		for(int d=k;d<n+1;d++){
          	kari=p1[d]-p1[d-k];
        	if(max<kari){
            	max=kari;
            }
        }
    
 	 double ans=(max+k)/2;
    	System.out.println(ans);
    }
}