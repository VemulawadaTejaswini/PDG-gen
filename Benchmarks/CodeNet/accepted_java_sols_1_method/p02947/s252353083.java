import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        long cnt = 0;
        for (int i = 0; i < N; i++) {
            List<String> strList = Arrays.stream(sc.next().split("")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            String str = String.join("", strList);
            list.add(str);
            if (hash.containsKey(str)) {
                hash.put(str, hash.get(str) + 1);
            } else {
                hash.put(str, 1);
            }
        }

        for (long c : hash.values()) {
            cnt += c * (c - 1) / 2;
        }
        System.out.println(cnt);
        sc.close();
    }
}