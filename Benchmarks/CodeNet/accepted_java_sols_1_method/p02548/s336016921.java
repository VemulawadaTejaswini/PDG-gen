import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int cnt=0;
                
                for(int i=1; i<=Math.sqrt(N); i++){
                    for(int j=N; i<=j; j--){
                        if(i*j<=N-1){
                            if(i==j){
                                cnt++;
                            }else{
                                cnt+=2;
                            }
                        }                     
                    }
                }
                
                System.out.println(cnt);

        }
}