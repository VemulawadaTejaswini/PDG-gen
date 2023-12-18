import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int Q = Integer.parseInt(s.next());
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < N; i++){
            int c = Integer.parseInt(s.next());
            set.add(c);
        }
        int max_val = Collections.max(set);
        for(int i = 0; i < Q; i++){
            int q = Integer.parseInt(s.next());
            int ans = max_val % q;
            for(int j = q; j <= max_val; j += q){
                Integer v = set.lower(j);
                if(v != null) ans = Math.max(ans, v % q);
            }
            System.out.println(ans);
        }
    }
}