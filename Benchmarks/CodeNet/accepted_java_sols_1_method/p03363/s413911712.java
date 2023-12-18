import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N+1];
        for(int i=1;i<=N;i++) A[i]=sc.nextLong();
        long[] sum = new long[N+1];
        for(int i=1;i<=N;i++) sum[i] = sum[i-1]+A[i];
        HashMap<Long,Integer> dic = new HashMap<>();
        for(int i=0;i<=N;i++){
            if(dic.containsKey(sum[i])) dic.put(sum[i],dic.get(sum[i])+1);
            else dic.put(sum[i],1);
        }
        long ans = 0;
        for(int i=0;i<=N;i++){
            if(dic.get(sum[i])==1) continue;
            ans += dic.get(sum[i])-1;
            dic.put(sum[i],dic.get(sum[i])-1);
        }
        System.out.println(ans);
    }
}
