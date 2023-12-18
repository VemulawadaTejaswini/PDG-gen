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
        for(int i=0; i<m; i++) {
            x[i] = Integer.parseInt(sc.next())-1;
            y[i] = Integer.parseInt(sc.next())-1;
            hs[x[i]]++;
            ws[y[i]]++;
        }
        
        int hmax = 0;
        for(int i=0; i<h; i++) {
            if(hmax < hs[i]) {
                hmax = hs[i];
            }
        }

        List<Integer> hmaxidx = new ArrayList<>();
        for(int i=0; i<h; i++) {
            if(hmax == hs[i]) {
                hmaxidx.add(i);
            }
        }
        
        List<int[]> mapw = new ArrayList<>();
        for(int i=0; i<hmaxidx.size(); i++) {
            mapw.add(new int[w]);
            for(int j=0; j<m; j++) {
                if(x[j] == hmaxidx.get(i)) {
                    mapw.get(i)[y[j]] = 1;
                }
            }
        }
        
        
        int count = 0;
        int max = 0;
        for(int i=0; i<hmaxidx.size(); i++) {
            for(int j=0; j<w; j++) {
                count = hmax + ws[j];
                if(mapw.get(i)[j] == 1) {
                    count--;
                }
                
                if(max < count) {
                    max = count;
                }
            }
        }
        
        System.out.println(max);
        
    }
}