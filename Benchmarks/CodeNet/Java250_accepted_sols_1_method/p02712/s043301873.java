import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		long ans=0;

  		int[] a=new int[n];
		for(int c=1;c<n+1;c++){
    		if(c%3!=0&&c%5!=0){
              ans+=c;
            }
    	}
    
 	

    	System.out.println(ans);
    }
}
