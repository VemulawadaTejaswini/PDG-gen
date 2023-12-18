import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        while (true) {
            int tmp = sc.nextInt();
            int L = sc.nextInt();
            if ((tmp | L) == 0)
                break;
            String key = String.format("%0" + L + "d", tmp);
            Map<String, Integer> map = new HashMap<String, Integer>();
            int c = 0;
            map.put(key, c);

            while (true) {
                c++;
                char tmps[] = key.toCharArray();
                Arrays.sort(tmps);
                StringBuilder sb = new StringBuilder();
                sb.append(tmps);
                String min = sb.toString();
                sb.reverse();
                String max = sb.toString();
                int na = Integer.parseInt(max) - Integer.parseInt(min);
                key = String.format("%0" + L + "d", na);
                if (map.containsKey(key)) {
                    break;
                } else
                    map.put(key, c);
            }
            int j = map.get(key);
            int i = c;
            int a = Integer.parseInt(key);
            System.out.printf("%d %s %d\n", j, a, i - j);
        }
    }
}