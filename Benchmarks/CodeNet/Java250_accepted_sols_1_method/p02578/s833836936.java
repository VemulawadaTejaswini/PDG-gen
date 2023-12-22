import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                long[] A = new long[N];
                
                for(int i=0; i<N;i++){
                    A[i] = scan.nextLong();
                }
                
                long sum = 0;
                
                if(N==1){
                    System.out.println(0);
                }else{
                    for(int i=1; i<N;i++){
                        if(A[i-1]>=A[i]){
                            sum += A[i-1] -A[i];
                            A[i] = A[i-1];                            
                        }
                    }
                     System.out.println(sum);
                }                          
        }
}