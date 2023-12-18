import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int[] p=new int[n];
  		int d=0;
		for(int c=0;c<n;c++){
    		p[c]=sc.nextInt();
          	if(p[c]!=c+1){
            	d++;
            }
              
    	}
  		
  
 	if(d<=2){
    		System.out.println("YES");
    	}else{
     		System.out.println("NO");
   	 }

    	
    }
}
