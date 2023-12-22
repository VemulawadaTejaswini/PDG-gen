import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		int max1=a[0];
  		int max2=0;
  		int b1=0;
  		
  		
  		for(int b=0;b<n-1;b++){
        	if(max1<=a[b+1]){
              	max2=max1;
            	max1=a[b+1];
              	b1=b+1;
              	
            }else if(max2<=a[b+1]){
            	max2=a[b+1];
            }
        }
 
    for(int e=0;e<n;e++){
 	if(e==b1){
    		System.out.println(max2);
    	}else{
     		System.out.println(max1);
   	 }
    }
    }
}

