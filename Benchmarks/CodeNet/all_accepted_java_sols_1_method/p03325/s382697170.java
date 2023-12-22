import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
		
		for(int c=0;c<n;c++){
    		long a=sc.nextInt();
          while(a>0){
            if(a%2==0){
          	ans++;
              a=a/2;
            }else{
            break;
            }
          }
    	}
    
    	System.out.println(ans);
    }
}
