import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();

        String[] texts = new String[n];
        for (int i = 0; i < n; i++) {
            texts[i] = std.next();
        }

        String[] sortedTexts = new String[n];

        for (int i = 0; i < n; i++) {
            String text = texts[i];
            List<String> textList = Arrays.asList(text.split(""));
            Collections.sort(textList);
            String sorted = String.join("",textList);
            sortedTexts[i] = sorted;
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sortedTexts[i];
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        long ans = 0;
        while (it.hasNext()) {
            long count = it.next().getValue();
            ans += count * (count - 1) / 2;
        }

        System.out.println(ans);
    }
}
