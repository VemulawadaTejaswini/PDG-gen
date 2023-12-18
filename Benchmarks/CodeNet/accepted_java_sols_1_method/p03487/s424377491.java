import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> cnts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            int cnt = 1;
            if(cnts.containsKey(a)) {
                cnt += cnts.get(a);
            }

            cnts.put(a, cnt);

        }

        int remove = 0;
        for(Map.Entry entry : cnts.entrySet()){
            int num = (int)entry.getKey();
            int cnt = (int)entry.getValue();

            if(num > cnt){
                remove += cnt;
            } else {
                remove += cnt - num;
            }
        }

        out.println(remove);
    }
}