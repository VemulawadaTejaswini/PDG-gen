import java.util.*;
public class Main {
    
    static int[] g = null;
    
    static int prod(int l, int r){
        int p = 1;
        while(l<=r) p*=g[l++];
        return p;
    }
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int K = sc.nextInt();
        int NOC = N;
        int i = 0; int j = 0; int prev = -1;
        g = new int[N];
        while(NOC-->0) g[i++] = sc.nextInt();
        NOC = N-K; 
        for(int k = 0; k<=NOC; k++){
            int p = prod(k,k+(K-1));
            if(prev!=-1) System.out.println((p>prev)? "Yes" : "No");
            prev=p;
        }
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}
