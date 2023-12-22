import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        ArrayList<String> l = new ArrayList<>();
        int diffCnt = 0;
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            l.add(String.valueOf(S.charAt(i)));
        }
        Collections.sort(l);

        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i).equals(l.get(i + 1))) {
                diffCnt++;
            }
        }

        System.out.println(diffCnt == 2 ? "Yes" : "No");
    }

}
