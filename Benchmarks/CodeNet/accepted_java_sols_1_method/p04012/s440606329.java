import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char s[] = scanner.nextLine().toCharArray();
        Map<String, Integer> map = new HashMap<>();
        for (char str : s) {
            if (!map.containsKey(String.valueOf(str))) {
                map.put(String.valueOf(str), Integer.valueOf(1));
            } else {
                Integer count = map.get(String.valueOf(str));
                map.put(String.valueOf(str), count + 1);
            }
        }
        boolean ansflag = true;
        for (Integer count: map.values()) {
            if (count % 2 != 0) {
                ansflag = false;
            }
        }

        if (ansflag) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}
