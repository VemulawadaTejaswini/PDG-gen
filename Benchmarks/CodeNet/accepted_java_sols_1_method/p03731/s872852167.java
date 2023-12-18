import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=sc.nextLong();
  		long ans=t;

  		long[] a=new long[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		for(int d=1;d<n;d++){
         if((a[d]-a[d-1])<t){
          ans=ans-t+a[d]-a[d-1];
         }
          ans+=t;
        }
    
 	
    	System.out.println(ans);
    }
}
