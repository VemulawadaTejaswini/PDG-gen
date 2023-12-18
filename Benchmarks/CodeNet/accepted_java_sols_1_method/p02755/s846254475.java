import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
        int b=sc.nextInt();
  		double a1=(double)a/0.08;
        double b1=(double)b/0.1;
  		int a2=(int)Math.ceil(a1);
        int b2=(int)Math.ceil(b1);
  		int ans=0;
  		
  		if(a2==b2){
        	ans=a2;
        }else if(a2<b2){
          if(Math.floor(b2*0.08)==(double)a){
          	ans=b2;
          }else{
          	ans=-1;
          }
        }else{
          if(Math.floor(a2*0.1)==(double)b){
          	ans=a2;
          }else{
          	ans=-1;
          }
        }
  		
    
 	

    	System.out.println(ans);
    }
}