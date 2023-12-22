

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int k = sc.nextInt();

            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 1; j <= 5; j++) {
                    if ( i + j > s.length() ) {
                        break;
                    }
                    String sub = s.substring(i, i + j);
                    set.add(sub);
                }
            }

            List<String> list = new ArrayList<>(set);
            Collections.sort(list);
            System.out.println(list.get(k - 1));
        }
    }
}
