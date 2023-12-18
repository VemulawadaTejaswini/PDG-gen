import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int N = Integer.parseInt(reader.readLine());
        Map<String, Integer> map = new LinkedHashMap<>();
        Long count = (long) 0;
        for (int i = 0; i < N; i++) {
            String str = reader.readLine();
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
        reader.close();

    }

}
