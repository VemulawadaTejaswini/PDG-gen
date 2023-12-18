import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> all = new ArrayList<>();
        int zn = 0;
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(num == 0) {
                zn++;
                all.add(0);
            } else if(num > 0) {
                pos.add(num);
                all.add(num);
            } else {
                neg.add(-num);
                all.add(-num);
            }
        }
        int pn = pos.size();
        int nn = neg.size();
        Collections.sort(pos, Comparator.reverseOrder());
        Collections.sort(neg, Comparator.reverseOrder());
        Collections.sort(all);
        long[] pa = new long[pn];
        long[] na = new long[nn];

        for(int i=0; i<pn; i++) {
            pa[i] = pos.get(i);
        }
        for(int i=0; i<nn; i++) {
            na[i] = neg.get(i);
        }

        if(pn + nn < k) {
            System.out.println(0);
            return;
        }

        if( k % 2 == 0 ) {
            int a = Math.min(pn - pn%2, k);
            int b = k - a;
            if(b > nn) {
                System.out.println(min(all, k));
                return;
            }
            int ma = a;
            int mb = b;
            while(true) {
                if(a >= 2 && b+2<=nn && pa[a-1]*pa[a-2] < na[b]*na[b+1]) {
                    a-=2;
                    b+=2;
                    ma = a;
                    mb = b;
                } else {
                    break;
                }
            }
            System.out.println(calc(pa, na, ma, mb));
        } else {
            int a = pn;
            if(pn %2 == 0) {
                a--;
            }
            a = Math.min(a, k);
            int b = k-a;
            if(a < 0 || b > nn) {
                System.out.println(min(all, k));
                return;
            }
            int ma = a;
            int mb = b;
            while(true) {
                if(a >= 2 && b+2<=nn && pa[a-1]*pa[a-2] < na[b]*na[b+1]) {
                    a-=2;
                    b+=2;
                    ma = a;
                    mb = b;
                } else {
                    break;
                }
            }
            System.out.println(calc(pa, na, ma, mb));

        }


    }
    static long mod = 1000000007;
    static long min(List<Integer> list, int k) {
        long res = 1;
        for(int i=0; i<k; i++) {
            res *= list.get(i);
            res %= mod;
        }
        if(res > 0) {
            res = (mod - res) % mod;
        }

        return res;

    }
    static long calc(long[] pa, long[] na, int a, int b) {
        long res = 1;
        for(int i=0; i<a; i++) {
            res *= pa[i];
            res %= mod;
        }
        for(int i=0; i<b; i++) {
            res *= na[i];
            res %= mod;
        }
        return res;
    }


}