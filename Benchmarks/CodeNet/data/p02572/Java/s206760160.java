import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                long[] A = new long[N];
                
                long ans = 0;
                long q = 10*10*10*10*10*10*10*10*10+7;
                
                for(int i=0; i<N; i++){
                    A[i] = scan.nextLong();
                    
                    for(int j=0; j<i; j++){
                        long P = A[i]*A[j];
                        P = P%q;

                        ans = ans + P;
                        
                        ans = ans%q;             
                    }
                }
                System.out.println(ans);
        }
}