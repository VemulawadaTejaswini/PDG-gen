import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
        long k = sc.nextLong();
        long count = 0;
        int ans = 0;
		long [] in = new long [100000];
        int a;
        long b;
        for(int i=0;i<n;i++){a = sc.nextInt();
                             b = sc.nextLong();
                             in[a-1]+=b;                           
                            }       		
        for(int i=0;i<100000;i++){count+=in[i];
                             if(count>=k){ans=i+1;break;}
                            }                                                      
		System.out.println(ans);
	}
}
