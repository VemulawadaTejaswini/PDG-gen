import java.util.*;

public class Main{
    
    public static final long INF = (long)1e11;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        TreeSet<Long> s = new TreeSet<>();
        TreeSet<Long> t = new TreeSet<>();
        s.add(INF);
        s.add(-INF);
        t.add(INF);
        t.add(-INF);
        for(int i=0; i<a; i++){
            s.add(Long.parseLong(sc.next()));
        }
        for(int i=0; i<b; i++){
            t.add(Long.parseLong(sc.next()));
        }
        long[] sa = new long[2];
        long[] ta = new long[2];
        for(int i=0; i<q; i++){
            long x = Long.parseLong(sc.next());
            sa[0] = s.lower(x);
            sa[1] = s.higher(x);
            ta[0] = t.lower(x);
            ta[1] = t.higher(x);
            long ans = INF;
            for(int j=0; j<4; j++){
                long jinja = sa[j&1];
                long tera = ta[j>>1];
                long sum = Math.abs(jinja-tera) + Math.min(Math.abs(x-jinja), Math.abs(x-tera));
                ans = Math.min(ans, sum);
            }
            System.out.println(ans);
        }
    }
}
