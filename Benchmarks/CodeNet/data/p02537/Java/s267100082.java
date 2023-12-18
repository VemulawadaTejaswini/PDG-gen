import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        var st = new SegmentTree(300001, 0);
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(sc.next());
            int min = Math.max(a-k, 0);
            int max = Math.min(a+k, 300000);
            st.update(a, st.getMax(min, max+1) +1);
        }
    
        System.out.println(st.getMax(0, 300001));
    }
    
    static class SegmentTree {
        int n;
        int[] node;
        
        public SegmentTree(int size, int defaultValue) {
            n = 1;
            while(n < size) n <<= 1;
            node = new int[2*n-1];
            Arrays.fill(node, defaultValue);
        }
        public SegmentTree(int[] a, int defaultValue) {
            n = 1;
            while(n < a.length) n <<= 1;
            node = new int[2*n-1];
            System.arraycopy(a, 0, node, n-1, a.length);
            Arrays.fill(node, n-1+a.length, 2*n-1, defaultValue);
            for(int i = n-2; i >= 0; i--){
                node[i] = Math.max(node[i*2+1], node[i*2+2]);
            }
        }
        void update(int i, int x){
            i += n-1;
            node[i] = x;
            while(i > 0){
                i = (i-1)/2;
                node[i] = Math.max(node[i*2+1], node[i*2+2]);
            }
        }
        int getMax(int a, int b){
            return getMax(a, b, 0, 0, n);
        }
        int getMax(int a, int b, int k, int l, int r){
            if(r <= a || b <= l) return Integer.MIN_VALUE;
            if(a <= l && r <= b) return node[k];
            int vl = getMax(a, b, k*2+1, l, (l+r)/2);
            int vr = getMax(a, b, k*2+2, (l+r)/2, r);
            return Math.max(vl, vr);
        }
        int get(int i){
            return node[i+n-1];
        }
    }
}