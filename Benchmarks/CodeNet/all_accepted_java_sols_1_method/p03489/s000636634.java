import java.util.*;
class Main{
    /*
     * 整数 -> nextInt() (遅い場合は下のni())
     * 単語 -> next()
     * 1行 -> nextLine()
     * 注意 : nextLIneをnext(),nextInt()のあとに呼び出す場合、次が改行だと改行だけ取ってしまうので注意
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i=0;i<N;i++) A[i] = sc.nextLong();

        Map<Long,Long> mp = new HashMap<>();
        for(int i=0;i<N;i++){
            if(mp.containsKey(A[i])){
                mp.put(A[i],mp.get(A[i])+1);
            }else{
                mp.put(A[i],1L);
            }
        }

        long ans = 0;
        for(Map.Entry<Long,Long> e : mp.entrySet()){
            long key = e.getKey();
            long val = e.getValue();

            if(key > val) ans += val;
            else if(key < val) ans += (val - key);
        }
        System.out.println(ans);
    }
}
