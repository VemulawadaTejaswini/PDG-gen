import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Map<String, Integer> map = new LinkedHashMap<>();
        Long count = (long) 0;
        for (int i = 0; i < N; i++) {
            String str = scan.next();
            char[] chars = str.toCharArray();
            Arrays.parallelSort(chars);
            str = new String(chars);
            if (map.containsKey(str)) {
                count += map.get(str);
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println(count);
        scan.close();

    }

}
