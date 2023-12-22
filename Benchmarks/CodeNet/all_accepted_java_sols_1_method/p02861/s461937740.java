
import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args){
        
    	Scanner sc= new Scanner(System.in);
    	int N=sc.nextInt();
    	sc.nextLine();
        int[] x =new int[2*N];
        for(int i=0;i<2*N;i++) {
        	x[i]=sc.nextInt();
        	
        }
       
        double d=0;

        for(int i=0;i<2*N;i+=2) {
        	for(int j=i+2;j<2*N;j+=2) {
        		
        		int dx=Math.abs(x[j]-x[i]);
        		int dy=Math.abs(x[i+1]-x[j+1]);
        		d+=Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
        		
        	}
    	}

        int z=N*(N-1)/2;
        double answer=d/z*(N-1);
        System.out.println(answer);
    }
}