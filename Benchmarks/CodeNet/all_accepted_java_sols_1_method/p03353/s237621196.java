import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                set.add(s.substring(j, j + i));
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list.get(k - 1));
    }

}
