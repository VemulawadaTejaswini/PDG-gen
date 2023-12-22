import java.util.*;

public class Main {
    public static int MOD = 998244353;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int x = sc.nextInt();
        int m = sc.nextInt();
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(x);
        map.put(x, 1);
        long now = x;
        int count = 1;
        int last = 0;
        for (long i = 0; i < n; i++) {
            now = (now * now) % m;
            int key = (int)now;
            
            int val = map.getOrDefault(key, 0);
            if (val == 1) {
                last = key;
                break;
            } else {
                map.put(key, ++val);
                count++;
                list.add(key);
            }
        }
        
        int last_idx = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == last) {
                last_idx = i;
            }
        }
        // System.out.println(last);
        // System.out.println(last_idx);
        
        int prev = last_idx;
        long block = (n-prev) / (count-prev);
        long amari = (n-prev) % (count-prev);
        
        List<Integer> list2 = new ArrayList<Integer>();
        long setsum = 0;
        for(int i = last_idx; i < count; i++) {
            list2.add(list.get(i));
            setsum += list.get(i);
        }
        
        // long block = n / count;
        // long amari = n % count;
        // long ans = 
        long ans = 0;
        for (int i = 0; i < last_idx; i++) {
            ans += list.get(i);
        }
        // System.out.println(ans);
        ans += block * setsum;
        // System.out.println(amari);
        for (Integer key : list2) {
            if (amari > 0) {
                ans += key;
                amari--;
            } else {
                break;
            }
        }
        // System.out.println(sum);
        // System.out.println(256+471+620+16+256+471+620);
        // System.out.println(count);
        // System.out.println(map.toString());
        // System.out.println(list.toString());
        System.out.println(ans);
    }
}
