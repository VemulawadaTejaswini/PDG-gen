import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       	int ans=0;
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
           if(a[c]%2==0){
           	if(a[c]%3==0||a[c]%5==0){
            	ans=0;
            }else{
            	ans=1;
               break;
            }
           }
    	}
    
 	if(ans==0){
    		System.out.println("APPROVED");
    	}else{
     		System.out.println("DENIED");
   	 }

    	
    }
}