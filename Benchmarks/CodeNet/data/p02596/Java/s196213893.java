import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int K = scan.nextInt();
               
                int n = -1;
                
                if(K%2==0){
                    System.out.println(n);
                }else{
                    n=n+2;
                    long p = 7;
                    for(long i=1; i<K; i++){
                        if(i==1){
                            if(p%K==0){ 
                                break;
                            }
                        }else{
                            p = (p*10+7)%K;
                            if(p%K==0){ 
                                break;
                            }
                        }
                        n++;
                        if(i==K-1){
                            System.out.println(-1);
                        }
                    }
                    
                    System.out.println(n);
                }
        }
}