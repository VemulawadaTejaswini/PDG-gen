import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int k = scanner.nextInt();
            for(int j = 0; j < k; j++) {
                int a = scanner.nextInt();
                Integer val = map.get(a);
                if(val == null) {
                    map.put(a, 1);
                }else{
                    map.put(a, val + 1);
                }
            }
        }


        int ans = 0;
        for(Integer key : map.keySet()) {
            if(map.get(key) == N) {
                ans++;
            }
        }

        System.out.println(ans);

    }
}