import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                long[] A = new long[N];
                
                long ans = 0;
                long q = 10*10*10*10*10*10*10*10*10+7;
                long r = 0;
                for(int i=0; i<N; i++){
                    A[i] = scan.nextLong();
                    
                    ans = ans + A[i]*r;
                    ans = ans%q;
                    
                    r += A[i];
                    r = r%q;

                }
                System.out.println(ans);
        }
}