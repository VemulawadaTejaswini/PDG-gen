import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
		long [] in = new long [n+1];
        long [] in2 = new long [m+1];       
        for(int i=1;i<n+1;i++){                               
                               in[i]=in[i-1]+sc.nextLong();
                              }
        for(int i=1;i<m+1;i++){                            
                               in2[i]=in2[i-1]+sc.nextLong();
                              }
        int ans = 0;        
        int best = m;
        for(int i=0;i<=n;i++){if(in[i]>k){break;}
        for(int j=best;j>=0;j--){if(in[i]+in2[j]<=k){best=j;
                                                     ans=Math.max(ans,i+j);
                                                     break;
                                                    }
                                }        
        }                                                                  
		System.out.println(ans);
	}
}