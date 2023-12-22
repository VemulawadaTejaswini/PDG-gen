import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        final long Mod = 1000000000+7;
        long i=1;
        long ans = 1;
        while(i<=N){
            ans = (ans*i)%Mod;
            i++;
        }
        System.out.println(ans);
    }
}
