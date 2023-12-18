import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] hs = new int[h];
        int[] ws = new int[w];
        int[] x = new int[m];
        int[] y = new int[m];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<m; i++) {
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            if(map.containsKey(x[i]-1)) {
                map.get(x[i]-1).add(y[i]-1);
            }else {
                map.put(x[i]-1, new ArrayList<Integer>());
                map.get(x[i]-1).add(y[i]-1);
            }
            hs[x[i]-1]++;
            ws[y[i]-1]++;
        }
        
        int hmax = 0;
        int hmaxidx = 0;
        for(int i=0; i<h; i++) {
            if(hmax < hs[i]) {
                hmax = hs[i];
                hmaxidx = i;
            }
        }

        List<Integer> list = map.get(hmaxidx);
        int count = 0;
        int max = 0;
        int wmaxidx = 0;
        for(int i=0; i<w; i++) {
            if(list.contains(i)) {
                count = hmax + ws[i] - 1;
            }else {
                count = hmax + ws[i];
            }
            
            if(max < count) {
                max = count;
                wmaxidx = i;
            }
        }
        System.out.println(max);

    }
}
