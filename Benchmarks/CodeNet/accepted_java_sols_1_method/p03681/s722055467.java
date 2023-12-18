import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        final long Mod = 1000000000+7;
        if(M>N){ // let N be the bigger one;
            int temp = N;
            N = M;
            M = temp;
        }
        if(N-M>=2){
            System.out.println(0);
            System.exit(0);
        }
        long[] Ms = new long[M+1];
        Ms[1]=1;
        for(int i=2;i<=M;i++){
            Ms[i]=(Ms[i-1]*((long)i))%Mod;
        }
        long ans=Ms[M];
        for(int i=1;i<=N;i++){
            ans = (ans*i)%Mod;
        }
        if(M==N) ans = (2*ans)%Mod;
        System.out.println(ans);
    }
}
