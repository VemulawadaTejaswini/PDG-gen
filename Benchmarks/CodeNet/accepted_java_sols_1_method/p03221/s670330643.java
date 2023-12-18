import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[m];
        int[] y = new int[m];
        //Map<Integer, Integer> ymap = new HashMap<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            //ymap.put(y[i], p[i]);
            map.put(y[i], i);
        }

        int[] num = new int[m];
        int[] parr = new int[n];
        /*
        for(int key : map.keySet()) {
            int pre = ymap.get(key);
            parr[pre-1]++;
            num[map.get(key)] = parr[pre-1];
        }
        */
        for(int key : map.keySet()) {
            int pre = p[map.get(key)];
            parr[pre-1]++;
            num[map.get(key)] = parr[pre-1];
        }
        
        for(int i=0; i<m; i++) {
            String s = String.format("%06d", p[i])+String.format("%06d", num[i]);
            System.out.println(s);
        }
    }
}