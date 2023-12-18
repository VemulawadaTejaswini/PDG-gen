import java.util.*;
public class Main {
    
    static int[] g = null;
    
    // Incredible problem. Truly humbled by those ace coders solution at AtCoder
  	// I give myself C for effort
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int K = sc.nextInt();
        int NOC = N;
        int i = 0; 
        g = new int[N];
        while(NOC-->0) g[i++] = sc.nextInt();
        for(i=0; i<N-K; i++) System.out.println((g[i]<g[i+K])? "Yes" : "No");
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}
