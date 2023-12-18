import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int Q = Integer.parseInt(s.next());
        int[] ar = new int[N];
        TreeSet<Integer> set = new TreeSet<Integer>();
        int max_val = 0;
        for(int i = 0; i < N; i++){
            int c = Integer.parseInt(s.next());
            ar[i] = c;
            set.add(c);
            max_val = Math.max(max_val, c);
        }
        for(int i = 0; i < Q; i++){
            int q = Integer.parseInt(s.next());
            int ans = 0;
            if(q < 100){
                for(int j = 0; j < N; j++){
                    ans = Math.max(ans, ar[j] % q);
                }
            }else{
                for(int j = q; j <= max_val; j += q){
                    Integer v = set.lower(j);
                    if(v == null) continue;
                    ans = Math.max(ans, (int)(v) % q);
                }
            }
            System.out.println(ans);
        }
    }
}