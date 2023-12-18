import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e6+1;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int gcd = gcd(a);
        
        int[] osa_k = osa_k(MAX);
        int[] e = new int[MAX];
        Arrays.fill(e, -1);
        boolean pc = true;
        for(int i=0; i<n; i++){
            if(a[i] == 1){
                continue;
            }
            int p = osa_k[a[i]];
            if( !(e[p] == -1 || e[p] == i) ){
                pc = false;
                break;
            }
            e[p] = i;
            a[i] /= p;
        }
        
        
        if(pc && gcd==1){
            System.out.println("pairwise coprime");
        }else if(gcd==1){
            System.out.println("setwise coprime");
        }else{
            System.out.println("not coprime");
        }
        
    }
    
    static int gcd(int a, int b){
        if(a < b){
            return gcd(b, a);
        }
        if(b > 0){
            return gcd(b, a%b);
        }
        return a;
    }
    
    static int gcd(int[] a){
        int res = a[0];
        for(int i=1; i<a.length; i++){
            res = gcd(res, a[i]);
        }
        return res;
    }
    
    static public int[] osa_k(int max){
        int[] res = new int[max];
        for(int i=0; i<max; i++){
            res[i] = i;
        }
        for(int i=2; i*i<max; i++){
            if(res[i] < i) continue;
            for(int j=i*i; j<max; j+=i){
                if(res[j] == j){
                    res[j] = i;
                }
            }
        }
        return res;
    }
}
