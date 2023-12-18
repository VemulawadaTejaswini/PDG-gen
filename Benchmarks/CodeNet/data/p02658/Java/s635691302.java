import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        int[] count = new int[N];
        int cnt = 0;
        long ans = 1;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextLong();
            b[i] = a[i];
            while(b[i]/10 != 0){
                b[i]/=10;
                count[i]++;
                //System.out.print(count[i]);
            }
            if(a[i]==0){
                ans=0;
                break;
            }
            ans *= a[i];
            cnt += count[i];
            //System.out.println("a[i]"+a[i]+"cnt"+cnt+"ans"+ans);
        }
        if(cnt>=18 && ans > 1000000000000000000l){
                ans = -1;
        }else if(ans > 1000000000000000000l){
            ans = -1;
        }
        System.out.println(ans);
    }
}
