import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] X = new int[100001];
                
                long ans = 0; 
                for(int i=1; i<=N; i++){
                    int A = scan.nextInt();
                    X[A]++;
                    ans = ans + A;
                }
                
                int Q = scan.nextInt();
                for(int i=1; i<=Q; i++){
                    int B = scan.nextInt();
                    int C = scan.nextInt();
                    
                    X[C] = X[C] + X[B];                  
                    ans = ans + C*X[B] - B*X[B];
                    X[B] = 0;
                    
                    System.out.println(ans);
                }
        }               
}
