import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();
        long ans = T;
        long[] t = new long[N];
        for(int i=0;i<N;i++) t[i]=sc.nextLong();
        long end = T;
        for(int i=1;i<N;i++){
            if(t[i]>=end){
                ans+=T;
            }
            else{
                ans += T-(end-t[i]);
            }
            end = t[i]+T;
        }
        System.out.println(ans);
    }
}
 