import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.print.event.PrintJobListener;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = 0;
        Set<String> set = new HashSet<>();
        for (int i = 1; i < n; i++) {
            List<String> ss = new ArrayList<>();
            char[] a = s.substring(i).toCharArray();
            char[] b = s.substring(0, i).toCharArray();
            int tmp = 0;
            for (char c : b) {
                if (String.valueOf(a).contains(String.valueOf(c)) && !ss.contains(String.valueOf(c))) {
                    tmp++;
                    ss.add(String.valueOf(c));
                }
            }
            result = Math.max(result, tmp);
        }
        System.out.println(result);
    }
}