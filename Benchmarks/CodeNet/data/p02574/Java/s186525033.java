import java.util.*;
public class Main{
    
    static final int MOD = (int)1e9+7;
    static final int MAX = (int)1e3+1;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        boolean[] prime = new boolean[MAX];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i=2; i*i<MAX; i++){
            for(int j=i*2; j<MAX; j+=i){
                prime[j] = false;
            }
        }
        
        ArrayList<Integer> p = new ArrayList<>();
        for(int i=0; i<MAX; i++){
            if(prime[i]){
                p.add(i);
            }
        }
        
        int[] cnt = new int[p.size()];
        for(int i=0; i<n; i++){
            int idx = 0;
            for(int v : p){
                if(a[i]%v==0){
                    cnt[idx]++;
                }
                idx++;
            }
        }
        
        boolean pc = true;
        for(int i=0; i<cnt.length; i++){
            if(cnt[i]>=2){
                pc = false;
            }
        }
        
        int gcd = a[0];
        for(int i=1; i<n; i++){
            gcd = gcd(gcd, a[i]);
        }
        
        
        if(pc && gcd==1){
            System.out.println("pairwise coprime");
        }else if(gcd==1){
            System.out.println("setwise coprime");
        }else{
            System.out.println("not coprime");
        }
    }
    
    static int gcd (int a, int b){
        return b>0 ? gcd(b,a%b) : a;
    }
}
