import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int[] A = new int[N+1];
                
                long ans = 0;
                A[0]=0;

                for(int i=1; i<=N;i++){
                    A[i] = scan.nextInt();
                }               
                Arrays.sort(A);

                
                for(int i=1; i<N;i++){
                    int p=0;
                    if((i%2)==0){
                        p = N-i/2;
                    }else{
                        p = N-i/2;
                    }
                    ans = ans + A[p];
                } 
                System.out.println(ans);
        }               
}