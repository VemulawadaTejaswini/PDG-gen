import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
  		int[] h=new int[n];
		for(int c=0;c<n;c++){
		    
    		h[c]=sc.nextInt();
            if(c==0){
                
                count+=h[c];
                
            }else if(h[c-1]<h[c]){
                
                count+=h[c]-h[c-1];
            }
    	}
        
    	System.out.println(count);
        
    }
}
