import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        char[] x = s.toCharArray();
        int popcount = 0;
        for(int i=0; i<n; i++){
            if(x[i]=='1'){
                popcount++;
            }
        }

        //0 -> popcount-1
        //2 -> popcount+1
        int[] remx = new int[3];
        int[][] rem2beki = new int[3][n+1];
        for(int i=0; i<3; i+=2){
            int mod = popcount-1+i;
            if(mod<=0){
                continue;
            }
            rem2beki[i][0] = 1;
            for(int j=0; j<n; j++){
                rem2beki[i][j+1] = rem2beki[i][j]*2%mod;
                remx[i] = remx[i]*2 + ((x[j]=='1')?1:0);
                remx[i] %= mod;
            }
        }

        for(int i=0; i<n; i++){
            if(popcount==1 && x[i]=='1'){
                System.out.println(0);
                continue;
            }

            int j = (x[i]=='0') ? 2 : 0;
            int res = remx[j];
            if(x[i]=='0'){
                //mod popcount+1
                res += rem2beki[j][n-1-i];
                res %= popcount+1;
            }else{
                //mod popcount-1
                res -= rem2beki[j][n-1-i] - (popcount-1);
                res %= popcount-1;
            }

            System.out.println(calc(res)+1);
        }
    }

    public static int calc(int n){
        if(n==0){
            return 0;
        }

        int popcount = Integer.bitCount(n);
        int res = n%popcount;

        return calc(res)+1;
    }
}