import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(b);
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(b[i])){
                map.put(b[i], cnt++);
            }
        }
        long ans = 0L;
        BIT bit = new BIT(n);
        for (int i = 0; i < n; i++) {
            ans += i - bit.sum(map.get(a[i]));
            bit.add(map.get(a[i]), 1);
        }
        System.out.println(ans);
        sc.close();

    }

}

class BIT {

    public int n;
    public long[] bit;

    public BIT(int n){
        this.n = n;
        bit = new long[n+1];
    }

    public long sum(int i){
        long s = 0L;
        while(0 < i){
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }

    public void add(int i, int x){
        while(i <= n){
            bit[i] += x;
            i += i & -i;
        }
    }

}

