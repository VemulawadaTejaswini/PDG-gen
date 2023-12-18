import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
  		int[] h=new int[n];
		for(int c=0;c<n;c++){
    		h[c]=sc.nextInt();
       
          }
    	
  
  		int ans=0;
  		int max=h[0];
  		
  
    for(int d=1;d<n;d++){
        if(h[d]<max-1){
            	ans++;
                break;
            }else{
        	max=Math.max(max,h[d]);
        }
        }
  
  
 	if(ans==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}