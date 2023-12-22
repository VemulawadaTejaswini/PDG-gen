import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<String, Integer> s = new HashMap<>();

        long result = 0;
        for (int i = 0; i < n; i++) {
            String[] arrS = sc.next().split("");
            Arrays.sort(arrS);
            StringBuilder sb = new StringBuilder();
            for (String c : arrS) {
                sb.append(c);
            }
            String key = sb.toString();
            if (s.containsKey(key)) {
                result += s.get(key);
                s.put(key, s.get(key) + 1);
            } else {
                s.put(key, 1);
            }
        }

        System.out.println(result);
    }
}