import java.util.*; 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long d=sc.nextLong();
  		int ans=0;

		for(int c=0;c<n;c++){
		long x=sc.nextLong();
        long y=sc.nextLong();
          if((x*x+y*y)<=(d*d)){
           ans++;
          }
    	}
    
 	

    	System.out.println(ans);
    }
}
