import java.util.*;
import java.util.stream.Collectors;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        if (k >= map.size()) {
            System.out.println(0);
            return;
        }
        List<Integer> list = new ArrayList<Integer>(map.values());
        Collections.sort(list);
        int count = list.size();
        int num = 0;
        for(int a : list){
            num += a;
            count--;
            if(count <= k){
                System.out.println(num);
                return;
            }
        }
    }
}