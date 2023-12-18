import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int n=sc.nextInt();
  		int b=0;

  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
          	b+=a[c];
    	}
    
 	if(b>=h){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    
    }
}