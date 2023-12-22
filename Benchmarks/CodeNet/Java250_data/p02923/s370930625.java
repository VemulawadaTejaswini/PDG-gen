import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
  		int[] h=new int[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextInt();
    	}
    	
  		int c=0;
  		int ans=0;
  		for(int d=0;d<n-1;d++){
        	if(h[d]>=h[d+1]){
              c++;
            }else{
              if(ans<c){
               ans=c;
              }
             c=0;
            }
        }
		if(ans<c){
         ans=c;
        }
    	System.out.println(ans);
    }
}

