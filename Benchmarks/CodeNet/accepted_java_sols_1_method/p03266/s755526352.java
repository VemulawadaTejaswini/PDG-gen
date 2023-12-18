import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] rem = new long[K];
        rem[0]=(long) N/K;
        for(int i=1;i<K;i++){
            long cur = N-rem[0]*K;
            if(i<=cur) rem[i]=rem[0]+1;
            else rem[i]=rem[0];
        }
        long ans = 0;
        ans += rem[0]*rem[0]*rem[0];
        if(K%2==0) ans += rem[K/2]*rem[K/2]*rem[K/2];
        System.out.println(ans);
    }
}
