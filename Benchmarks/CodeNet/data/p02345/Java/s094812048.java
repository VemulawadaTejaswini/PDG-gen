import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        
        SegmentTree st = new SegmentTree(n, Integer.MAX_VALUE);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            if(sc.next().equals("0")){
                st.update(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            }else{
                sb.append(st.getMin(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()) +1, 0, 0, st.n));
                sb.append(System.lineSeparator());
            }
        }
        System.out.print(sb);
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
        void update(int i, int x){
            i += n-1;
            node[i] = x;
            while(i > 0){
                i = (i-1)/2;
                node[i] = Math.min(node[i*2+1], node[i*2+2]);
            }
        }
        int getMin(int a, int b, int k, int l, int r){
            if(r <= a || b <= l) return Integer.MAX_VALUE;
            if(a <= l && r <= b){
                return node[k];
            }else{
                int vl = getMin(a, b, k*2+1, l, (l+r)/2);
                int vr = getMin(a, b, k*2+2, (l+r)/2, r);
                return Math.min(vl, vr);
            }
        }
    }
}
