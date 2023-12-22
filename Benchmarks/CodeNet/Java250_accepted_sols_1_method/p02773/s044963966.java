import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = sc.next();
            }

            HashMap<String, Integer> sToNumber = new HashMap<String, Integer>();
            for (int i = 0; i < N; i++) {
                Integer number = sToNumber.get(S[i]);
                sToNumber.put(S[i], 1 + (number == null ? 0 : number.intValue()));
            }

            ArrayList<String> list = new ArrayList<>();
            int max = 0;
            for (String key : sToNumber.keySet()) {
                int number = sToNumber.get(key).intValue();
                if (number >= max) {
                    if (number > max) {
                        max = number;
                        list.clear();
                    }
                    list.add(key);
                }
            }
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}