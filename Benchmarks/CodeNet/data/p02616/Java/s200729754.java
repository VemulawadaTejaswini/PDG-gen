import java.util.*;

public class Main{
    
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int mlen = 0;
        int plen = 0;
        boolean existZero = false;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next());
            if(a[i] == 0){
                existZero = true;
            }else if(a[i] < 0){
                mlen++;
            }else{
                plen++;
            }
        }
        
        Arrays.sort(a);
        
        int[] minusArray = new int[mlen];
        int[] plusArray = new int[plen];
        for(int i=0; i<mlen; i++){
            minusArray[i] = a[i];
        }
        for(int i=0; i<plen; i++){
            plusArray[i] = a[n-1-i];
        }
        
        if(mlen + plen < k){
            //0にしかならない
            System.out.println(0);
            return;
        }
        
        if(!existZero && plen==0 && k%2==1){
            //負のみ、kが奇数
            long ans = 1;
            for(int i=0; i<k; i++){
                ans *= minusArray[mlen-1-i];
            }
            System.out.println((ans+MOD)%MOD);
            return;
        }
        
        long[] multiArray = new long[(mlen+1)/2];
        Arrays.fill(multiArray, 1);
        for(int i=0; i<mlen; i++){
            multiArray[i/2] *= minusArray[i];
        }
        
        long ans = 1;
        int pidx = 0;
        int midx = 0;
        while(k > 0){
            //嬉しい方を掛ける
            long p = 0;
            long m = 0;
            if(pidx < plusArray.length){
                p = plusArray[pidx];
                p = p*p;
            }
            if(midx < multiArray.length){
                m = multiArray[midx];
            }
            if(p > m){
                ans *= plusArray[pidx];
                pidx++;
                k--;
            }else{
                ans *= m;
                midx++;
                k-=2;
            }
            ans %= MOD;
        }
        
        System.out.println(ans);
        
    }
    
}
