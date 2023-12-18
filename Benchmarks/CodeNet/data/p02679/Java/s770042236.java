1. import java.util.*;
2. import java.io.*;
3.  
4. public class Main {
5.     public static void main(String[] args) throws Exception {
6.         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
7.         int N = Integer.parseInt(br.readLine());
8.         
9.         Map<List<Long>, List<Long>> mp = new HashMap<>();
10.         int zero = 0;
11.         int mod = 1000000007;
12.         for(int i = 0; i < N; i++) {
13.             String[] sp = br.readLine().split(" ");
14.             long x = Long.parseLong(sp[0]), y = Long.parseLong(sp[1]);
15.             if(x == 0 && y == 0) {
16.                 zero ++;
17.                 continue;
18.             }
19.             long g = gcd(x, y);
20.             x /= g; y /= g;
21.             if(x <= 0) {
22.                 long tmp = x;
23.                 x = y; y = -tmp;
24.                 List<Long> lk = new ArrayList<>();
25.                 lk.add(x); lk.add(y);
26.                 if(!mp.containsKey(lk)) {
27.                     List<Long> lv = new ArrayList<>();
28.                     lv.add(0L); lv.add(1L);
29.                     mp.put(lk, lv);
30.                 } else {
31.                     List<Long> l = mp.get(lk);
32.                     l.set(1,l.get(1)+1);
33.                     mp.put(lk, l);
34.                 }
35.             } else {
36.                 List<Long> lk = new ArrayList<>();
37.                 lk.add(x); lk.add(y);
38.                 if(!mp.containsKey(lk)) {
39.                     List<Long> lv = new ArrayList<>();
40.                     lv.add(1L); lv.add(0L);
41.                     mp.put(lk, lv);
42.                 } else {
43.                     List<Long> l = mp.get(lk);
44.                     l.set(0,l.get(0)+1);
45.                     mp.put(lk, l);
46.                 }
47.             }
48.         }
49.         // System.out.println(mp);
50.         
51.         long ans = 1;
52.         for(List<Long> q : mp.keySet()) {
53.             List<Long> p = mp.get(q);
54.             Long s = p.get(0);
55.             Long t = p.get(1);
56.             long now = 1;
57.             now += pow(2, s) - 1;
58.             now += pow(2, t) - 1;
59.             now %= mod;
60.             if(now < 0) now += mod;
61.             ans *= now;
62.             ans %= mod;
63.             if(ans < 0) ans += mod;
64.         }
65.         
66.         ans += zero;
67.         ans -= 1;
68.         ans %= mod;
69.         if(ans < 0) ans += mod;
70.         System.out.println(ans);
71.         
72.     }
73.     
74.     public static long gcd(long n1,long n2) {
75.         if(n2==0) return n1;
76.         else return gcd(n2,n1%n2);
77.     }
78.     
79.     public static long pow(long n1, long n2) {
80.         long p = 1;
81.         for(int i = 0; i < n2; i++) {
82.             p *= n1;
83.         }
84.         return p;
85.     }
86. }
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Map<List<Long>, List<Long>> mp = new HashMap<>();
        int zero = 0;
        int mod = 1000000007;
        for(int i = 0; i < N; i++) {
            String[] sp = br.readLine().split(" ");
            long x = Long.parseLong(sp[0]), y = Long.parseLong(sp[1]);
            if(x == 0 && y == 0) {
                zero ++;
                continue;
            }
            long g = gcd(x, y);
            x /= g; y /= g;
            if(x <= 0) {
                long tmp = x;
                x = y; y = -tmp;
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Long> lv = new ArrayList<>();
                    lv.add(0L); lv.add(1L);
                    mp.put(lk, lv);
                } else {
                    List<Long> l = mp.get(lk);
                    l.set(1,l.get(1)+1);
                    mp.put(lk, l);
                }
            } else {
                List<Long> lk = new ArrayList<>();
                lk.add(x); lk.add(y);
                if(!mp.containsKey(lk)) {
                    List<Long> lv = new ArrayList<>();
                    lv.add(1L); lv.add(0L);
                    mp.put(lk, lv);
                } else {
                    List<Long> l = mp.get(lk);
                    l.set(0,l.get(0)+1);
                    mp.put(lk, l);
                }
            }
        }
        // System.out.println(mp);
        
        long ans = 1;
        for(List<Long> q : mp.keySet()) {
            List<Long> p = mp.get(q);
            Long s = p.get(0);
            Long t = p.get(1);
            long now = 1;
            now += pow(2, s) - 1;
            now += pow(2, t) - 1;
            now %= mod;
            if(now < 0) now += mod;
            ans *= now;
            ans %= mod;
            if(ans < 0) ans += mod;
        }
        
        ans += zero;
        ans -= 1;
        ans %= mod;
        if(ans < 0) ans += mod;
        System.out.println(ans);
        
    }
    
    public static long gcd(long n1,long n2) {
        if(n2==0) return n1;
        else return gcd(n2,n1%n2);
    }
    
    public static long pow(long n1, long n2) {
        long p = 1;
        for(int i = 0; i < n2; i++) {
            p *= n1;
        }
        return p;
    }
}
