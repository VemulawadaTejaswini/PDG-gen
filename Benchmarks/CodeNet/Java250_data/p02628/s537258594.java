import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int K = scan.nextInt();
                
                int[] ans = new int[N];
                
                for(int i=0; i<N; i++){
                    ans[i]  = scan.nextInt();
                }
                Arrays.sort(ans);
                
                int answer = 0;
                for(int i=0; i<K; i++){
                    answer = answer + ans[i];
                }
                
                System.out.println(answer);
        }
                
}
