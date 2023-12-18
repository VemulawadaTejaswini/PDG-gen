import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long T = sc.nextLong();
        long[] t = new long[N];
        long ans = 0;

        for(int i=0; i<N; i++){
            t[i] = sc.nextLong();
        }

        for(int i=0; i<N-1; i++){
            if(t[i+1]-t[i]<=T){
                ans += t[i + 1] - t[i];
            }
            else{
                ans += T;
            }
        }
        ans += T;
        System.out.println(ans);
    }
}