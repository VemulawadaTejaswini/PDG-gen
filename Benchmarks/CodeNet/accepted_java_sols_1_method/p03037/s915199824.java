
import java.util.Scanner;

public class Main{
	
	

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int[] L=new int[M];
    int[] R=new int[M];
    int[] max=new int[M];
    int[] min=new int[M];
    int rmax=N;
    int rmin=0;
    for(int i=0;i<M;i++) {
    	L[i]=sc.nextInt();
    	R[i]=sc.nextInt();
    	if(L[i]>=R[i]) {
    		max[i]=L[i];
    		min[i]=R[i];
    	}else if(L[i]<R[i]){
    		max[i]=R[i];
    		min[i]=L[i];
    	}
    	
    	if(min[i]>rmin) {
    		rmin=min[i];
    	}
    	
    	if(max[i]<rmax) {
    		rmax=max[i];
    	}
    }
    
   
    
    int count=0;
    for(int i=rmin;i<=rmax;i++) {
    	count++;
    }
    
    System.out.println(count);
    
    
    

	
	
	
    

		
	}
	

	
}
	