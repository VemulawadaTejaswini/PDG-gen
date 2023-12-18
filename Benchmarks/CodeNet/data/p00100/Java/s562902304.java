import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            execute(sc);

        }
    }

    static void execute(Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        if (n == 0) {
            return;
        }
        Map<String, Long> map = new LinkedHashMap<String, Long>();
        long price, count, rs;
        for (int i = 0; i < n; i++) {
            rs = 0;
            String[] line = sc.nextLine().split(" ");
            if (map.containsKey(line[0])) {
                rs = (Long) map.get(line[0]);
            }
            price = Long.parseLong(line[1]);
            count = Long.parseLong(line[2]);
            map.put(line[0], price * count + rs);
        }
        boolean exists = false;
        for (String key : map.keySet()) {
            if (map.get(key) >= 1000000) {
                System.out.println(key);
                exists = true;
            }
        }
        if (!exists) {
            System.out.println("NA");
        }
    }
}

