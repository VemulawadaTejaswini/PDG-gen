import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] used = new boolean[1_000_001];
        Arrays.sort(a);
        Set<Integer> set = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i])) {
                d.add(a[i]);
                continue;
            }
            if(used[a[i]])continue;
            set.add(a[i]);
            int x = a[i];
            while(x < 1_000_001){
                used[x] = true;
                x += a[i];
            }

//            if(set.contains(a[i])){
//                d.add(a[i]);
//                continue;
//            }
//            Map<Integer, Integer> map = new HashMap<>();
//            List<Integer> list = new ArrayList<>();
//            int x = a[i];
//            for (int j = 2; j < Math.sqrt(a[i])+1; j++) {
//                int c = 0;
//                while(x % j == 0){
//                    c++;
//                    x /= j;
//                }
//                if(0 < c) {
//                    map.put(j, c);
//                    list.add(j);
//                }
//            }
//            if(1 < x){
//                map.put(x, 1);
//                list.add(x);
//            }
//            Set<Integer> p = new HashSet<>();
//            p.add(1);
//            for(int b : list){
//                Set<Integer> nex = new HashSet<>();
//                int y = 1;
//                for (int j = 0; j <= map.get(b); j++) {
//                    for(int c : p){
//                        nex.add(c * y);
//                    }
//                    y *= b;
//                }
//                p = nex;
//            }
//            boolean able = true;
//            for(int b : p){
//                if(used[b]){
//                    able = false;
//                    break;
//                }
//            }
//            if(able)set.add(a[i]);
//            used[a[i]] = true;
        }
        System.out.println(set.size() - d.size());
        sc.close();

    }

}
