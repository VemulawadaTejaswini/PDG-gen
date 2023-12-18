import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] P = new int[N];
        int[] C = new int[N];

        Set<Integer> s = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        List<LinkedList> nlist  = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt()-1;
            s.add(P[i]);
            l.add(P[i]);
        }
        for (int i = 0; i < N; i++)
            C[i] = sc.nextInt();

        for(Integer pIdx: l){
            if(!s.contains(pIdx)) continue;
             LinkedList<Integer> n = new LinkedList();
            n.add(pIdx);
            nlist.add(n);
            s.remove(pIdx);
            int nIdx = P[pIdx];
            while(s.contains(nIdx)){
                n.add(nIdx);
                s.remove(nIdx);
                nIdx = P[nIdx];
            }
        }

        long max = Long.MIN_VALUE;
        for (LinkedList<Integer> llist : nlist) {
            max = Math.max(max,maxSum(llist,K,C));
        }
        System.out.println(max);
    }

    private static long maxSum(LinkedList<Integer> linkedList,int K,int[] C){

        long max = Integer.MIN_VALUE;
        long mod = K%linkedList.size();
        if(mod==0) mod =K;
        for (int i = 0; i < linkedList.size(); i++) {//startimg point
            long total = 0;
            for (int j = i; j < i+mod; j++) {//mod
                int indx = j%linkedList.size();
                int indx2  = linkedList.get(indx);
                long val = C[indx2];
                total += val;
                max = Math.max(total,max);
            }
        }

        long total2=0;
        if(K>linkedList.size()){
            for (int i = 0; i < linkedList.size(); i++) {//startimg point
                total2+=  C[linkedList.get(i)];
            }
            if(total2>0)
            max += total2* (K/linkedList.size());
        }

        return max;
    }}