import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.next();
        Set<String> setA = new HashSet<>(), setB = new HashSet<>();

        int max = 0;
        for (int i = 1; i < n; i++) {
            int count = 0;
            String ss = s.substring(0, i);
            String st = s.substring(i, s.length());
            for (int j = 0; j < ss.length(); j++) {
                setA.add(ss.substring(j, j + 1));
            }
            for (int j = 0; j < st.length(); j++) {
                setB.add(st.substring(j, j + 1));
            }
            List<String> list = new ArrayList<>(setA);
            for (String str : list) {
                if (setB.contains(str)) {
                    count++;
                }
            }
            max = Math.max(max, count);
            setA.clear();
            setB.clear();
        }
        System.out.println(max);
    }
}