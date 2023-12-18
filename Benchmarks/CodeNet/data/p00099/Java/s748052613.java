import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        int q = Integer.parseInt(s.next());
        long[] ar = new long[n+1];
        TreeSet<Long> set = new TreeSet<Long>();
        for(int i = 1; i <= n; i++){
            long key = 0 * 1000001 + (n-i);
            set.add(key);
        }
        for(int i = 0; i < q; i++){
            int a = Integer.parseInt(s.next());
            int v = Integer.parseInt(s.next());
            long old_key = ar[a] * 1000001 + (n-a);
            ar[a] += v;
            long new_key = ar[a] * 1000001 + (n-a);
            set.remove(old_key);
            set.add(new_key);
            long max_a = n-(long)(set.last()) % 1000001;
            long max_v = (long)(set.last()) / 1000001;
            System.out.println(max_a + " " + max_v);
        }
    }
}