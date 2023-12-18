import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        BIT bit = new BIT(n);
        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        for (int i=0; i<n; i++) bit.add(i+1, a[i]);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<q; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                int p = sc.nextInt();
                int x = sc.nextInt();
                bit.add(p+1, x);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int diff = bit.sum(r) - bit.sum(l);
                sb.append(diff + "\n");
            }
        }

//        System.out.print(sb.toString());

    }

    class BIT {
        int n;
        int[] arr;

        public BIT(int n) {
            this.n = n;
            arr = new int[n + 1];
        }

        void add(int idx, int val) {
            for (int i = idx; i <= n; i += i & -i) {
//                System.out.print(i);
                arr[i] += val;
            }
        }

        int sum(int idx) {
            int sum = 0;
            for (int i = idx; i > 0; i -= i & -i) {
                sum += arr[i];
            }
            return sum;
        }
    }


}

