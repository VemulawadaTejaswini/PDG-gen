import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Arrays.sort(arr);

//        List<Integer> list = new ArrayList<>();
//        for (int i=0; i<n; i++) list.add(sc.nextInt());
//        Collections.sort(list);

        int cnt = 0;

        int max = arr[n-1]+1;
        boolean[] flag = new boolean[max+1];
        for (int i=0; i<n; i++) flag[arr[i]] = true;
        int sqrt = (int)Math.sqrt(max+1);

        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            if (flag[tmp]) {
                for (int j=tmp*2; j<=max; j+=tmp) {
                    flag[j] = false;
                }
            }
            if (map.get(tmp)!=1) flag[tmp] = false;
        }

        for (int i=0; i<flag.length; i++) {
//            System.out.println(flag[i] + " ");
            if (flag[i]) cnt++;
        }

        System.out.println(cnt);
    }


}
