import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                
                long[] L = new long[N];
                
                for(int i=0; i<N; i++){
                    L[i] = scan.nextLong();
                }
                
                int ans = 0;
                
                if(N<=2){
                    System.out.println(0);
                }else{
                    for(int i=0; i<N-2; i++){
                        for(int j=i; j<N-1; j++){
                            for(int k=j; k<N; k++){
                                if(L[i]!=L[j] && L[k]!=L[j] && L[k]!=L[i]){
                                    long a = L[i]+L[j];
                                    long b = L[j]+L[k];
                                    long c = L[k]+L[i];
                                    if(a>L[k] && b>L[i] && c>L[j]){
                                        ans++;
                                    }
                                }
                            }
                        }
                    }
                    
                    System.out.println(ans);
                }