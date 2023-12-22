import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] buc = new long[100005];
        for(int i=1;i<=N;i++){
            int a = sc.nextInt();
            long b = sc.nextLong();
            buc[a] += b;
        }
        long cnt = 0;
        int ans = 0;
        for(int i=1;i<=100000;i++){
            cnt += buc[i];
            if(cnt>=K){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
 