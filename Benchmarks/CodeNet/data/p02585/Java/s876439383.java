import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        List<Integer> P = new ArrayList<>();
        List<Long> C = new ArrayList<>();
        for(int i=0;i<N;i++){
            P.add(sc.nextInt()-1);
        }
        for(int i=0;i<N;i++){
            C.add(sc.nextLong());
        }
        long mxAns = Long.MIN_VALUE;
        for(int i=0;i<N;i++){
            mxAns = Math.max(mxAns, startFrom(i, K, P, C));
        }
        System.out.println(mxAns);
    }

    private static long startFrom(int i, long K, List<Integer> P, List<Long> C) {
        if(K < P.size()){
            int now=i;
            long res = 0;
            long maxGet = Long.MIN_VALUE;
            for(int j=0;j<K;j++){
                int nxt = P.get(now);
                res += C.get(nxt);
                now = nxt;
                maxGet = Math.max(maxGet, res);
            }
            return maxGet;
        }else{
            List<Long> loop = new ArrayList<>();
            Set<Integer> visited = new HashSet<>();
            int now=i;
            visited.add(now);
            long res = 0;
            long maxGet = Long.MIN_VALUE;
            for(int j=0;j<C.size();j++){// To N.
                int nxt = P.get(now);
                res += C.get(nxt);
                //System.out.print(C.get(nxt) + "\t");
                loop.add(res);
                maxGet = Math.max(maxGet, res);
                now = nxt;
                if(visited.contains(nxt)){
                    break;
                }
                visited.add(now);
            }
//            System.out.println();
//            System.out.println(loop);
            if(loop.get(loop.size()-1) <= 0){
                return maxGet;
            }else{
                int loopSize = loop.size();
                long oneGain = loop.get(loop.size()-1);
                long maxkai = K/(long)loopSize;
                long remain = K-(maxkai * (long)loopSize);
                long remMax = Long.MIN_VALUE;
                for(int j=0;j<remain;j++){
                    remMax = Math.max(remMax, loop.get(j));
                }
                return Math.max(oneGain * maxkai + remMax, oneGain*(maxkai-1) + maxGet);
            }
        }
    }

}
