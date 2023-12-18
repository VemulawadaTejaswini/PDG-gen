import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                long K = scan.nextLong();
               
                long[] A= new long[N+1];
                long[] B= new long[M+1];
                A[0]=0;
                B[0]=0;
                for(int i=1; i<=N;i++){
                        long P = scan.nextLong();
                        A[i]=A[i-1]+P;
                }
                for(int i=1; i<=M;i++){
                        long Q = scan.nextLong();
                        B[i]=B[i-1]+Q;
                }
                int ans = 0;
                int bn = M;
                for(int i=0; i<=N&&A[i]<=K;i++){
                    for(int j=bn; j>=0;j--){
                        if(A[i]+B[j]<=K){
                            if(ans<i+j){
                                ans=i+j;
                            }
                            bn = j;
                            break;
                        }
                    }
                }
                System.out.println(ans);               
        }               
}