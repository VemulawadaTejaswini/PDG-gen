import java.util.*;
public class Main{
    public  static void main(String[] args){
    new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    int n, p;
 
    void run(){
    boolean[] prime = new boolean[1000000];
    setP(prime);
 
    while(kbd.hasNext()){
        n = kbd.nextInt();
        p = kbd.nextInt();
        if(n!=-1 && p!=-1){
        solve(prime);
        }
    }
    }
 
    void solve(boolean[] prime){
    int[] sum = new int[100000];
    Arrays.fill(sum, Integer.MAX_VALUE);
    setSum(sum, prime); 
    Arrays.sort(sum);
    /*
    int i=0;
    while(i<(a+p-1)){
        System.out.println(i+" "+sum[i]);
        i++;
    }
    */
    System.out.println(sum[p-1]);
    }
 
    void setP(boolean[] prime){
    int i, j, k=0;
    Arrays.fill(prime, true);
    prime[0] = false;
    prime[1] = false;
    for(i=2; i<prime.length; i++){
        for(j=i+i; j<prime.length; j+=i){
        if(prime[i]) prime[j] = false;
        }
    }
    }
 
    void setSum(int[]sum, boolean[] prime){
    int i=0, j=0, a=0, b;
    for(a=n+1; a<n+300 && i<sum.length; a++){
        b = a;
        for(; b<n+300 && i<sum.length; b++){
        if(prime[a] && prime[b]){
            sum[i] = a+b;
            //System.out.println("* "+pp[a]+" "+pp[b]+" "+sum[i]);
            i++;
        }
        }
    }
    }
}