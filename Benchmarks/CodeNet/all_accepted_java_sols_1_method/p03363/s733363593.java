import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;++i)A[i]=scan.nextLong();
        Map<Long,Integer> map = new HashMap<>();
        map.put(0L,1);
        long sum=0;
        long ans = 0;
        for(int i=0;i<N;++i){
            sum+=A[i];
            if(map.containsKey(sum))ans+=map.get(sum);
            else map.put(sum, 0);
            map.put(sum, map.get(sum)+1);
        }
        System.out.println(ans);
    }
}