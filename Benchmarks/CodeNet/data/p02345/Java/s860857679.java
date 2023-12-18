import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        RMQ rmq = new RMQ(n);
        for (int i = 0; i < q; i++) {
            int com = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(com == 0){
                rmq.update(x, y);
            }else{
                System.out.println(rmq.min(x, y+1, 0, 0, rmq.size));
            }
        }
        sc.close();
    }

}

class RMQ {

    public int n;
    public int size;
    public int[] data;
    private static int DATA_SIZE = 1_000_000;

    public RMQ(int n){
        this.n = n;
        size = 1;
        while(size < n) size *= 2;
        data = new int[DATA_SIZE];
        for (int i = 0; i < DATA_SIZE; i++) data[i] = Integer.MAX_VALUE;
    }

    public void update(int k, int a){
        k += size - 1;
        data[k] = a;
        while(0 < k){
            k = (k - 1) / 2;
            data[k] = Math.min(data[k * 2 + 1], data[k * 2 + 2]);
        }
    }

    public int min(int a, int b, int k, int l, int r){
        if(r <= a || b <= l) return Integer.MAX_VALUE;

        if(a <= l && r <= b) return data[k];

        int vl = min(a, b, k*2+1, l, (l+r)/2);
        int vr = min(a, b, k*2+2, (l+r)/2, r);
        return Math.min(vl, vr);
    }
}

