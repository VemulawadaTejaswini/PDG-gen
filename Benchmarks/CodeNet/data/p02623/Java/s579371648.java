import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long t = 0;
		long [] in = new long [n];
        long [] in2 = new long [m];
       
        for(int i=0;i<n;i++){
                             in[i] = sc.nextLong();
                            }
        for(int i=0;i<m;i++){
                             in2[i] = sc.nextLong();
                            }
        int ans = 0;
        int n1 = 0;
        int m1 = 0;
        while(t<=k){if(m1==m){if(n1<n){t+=in[n1];n1++;if(t<=k){ans++;}}else{break;}}
                    if(n1==n){if(m1<m){t+=in2[m1];m1++;if(t<=k){ans++;}}else{break;}}
                    if(m1<m && n1<n){if(in[n1]<in2[m1]){t+=in[n1];n1++;if(t<=k){ans++;}}
                                    else{t+=in2[m1];m1++;if(t<=k){ans++;}}}
                   }              
		System.out.println(ans);
	}
}