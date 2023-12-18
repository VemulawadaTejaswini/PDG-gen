import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static int maxturn;
    static int maxval = 10000007;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a*a*b*b*c;
        n = n*n;*/
        int n = sc.nextInt();
        boolean[] pri = new boolean[n+1];
        Arrays.fill(pri,true);
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(!pri[i]) continue;
            prime.add(i);
            for(int j=i;j<=n;j+=i) pri[j]=false;
        }
        HashMap<Integer,Integer> priIdx = new HashMap<>();
        for(int i=0;i<prime.size();i++) priIdx.put(prime.get(i),i);
        int[] cnt = new int[prime.size()];
        for(int i=2;i<=n;i++){
            int cur = i;
            for(int j=2;j<=cur;j++){
                while(cur%j==0){
                    int idx = priIdx.get(j);
                    cnt[idx]++;
                    cur /= j;
                }
            }
        }
        int c2=0,c4=0,c14=0,c24=0,c74=0;

        for(int i=0;i<cnt.length;i++){
            if(cnt[i]>=2) c2++;
            if(cnt[i]>=4) c4++;
            if(cnt[i]>=14) c14++;
            if(cnt[i]>=24) c24++;
            if(cnt[i]>=74) c74++;
        }
        int ans = c4*(c4-1)*(c2-2)/2+c24*(c2-1)+c14*(c4-1)+c74;
        System.out.println(ans);
    }
}