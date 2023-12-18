import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[h];
        int[] b = new int[h];

        for(int i=0; i<h; i++) {
            a[i] = Integer.parseInt(sc.next())-1;
            b[i] = Integer.parseInt(sc.next())-1;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Counter counter = new Counter();

        for(int i=0; i<w; i++) {
            map.put(i, 0);
        }
        counter.map.put(0, w);
        counter.map.put(w, 1);
        for(int i=0; i<h; i++) {
            Integer key;
            int rmin = w;
            while((key = map.ceilingKey(a[i])) != null && key <= b[i]) {
                rmin = Math.min(rmin, map.get(key) + b[i]+1-key);
                counter.remove(map.get(key));
                map.remove(key);
            }
            if(b[i]+1<w) {
                if (map.containsKey(b[i] + 1)) {
                    counter.remove(map.get(b[i] + 1));
                    int num = Math.min(rmin, map.getOrDefault(b[i] + 1, w));
                    map.put(b[i] + 1, num);
                    counter.add(num);
                } else {
                    map.put(b[i] + 1, rmin);
                    counter.add(rmin);
                }
            }
            int min = counter.head();
            if(min == w) {
                System.out.println(-1);
            } else {
                System.out.println(min + i + 1);
            }
        }

    }

    static class Counter {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        void add(Integer key) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        void remove(Integer key) {
            int num = map.get(key);
            if(num == 1) {
                map.remove(key);
            } else {
                map.put(key, num-1);
            }
        }

        Integer head() {
            return map.firstKey();
        }
    }



}
