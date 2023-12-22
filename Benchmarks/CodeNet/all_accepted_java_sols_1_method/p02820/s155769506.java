import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int p = sc.nextInt();
            String t = sc.next();

            List<String> aiteList = new ArrayList<>();
            List<Integer> takahashiList = new ArrayList<>();

            int score = 0;
            for (int i = 0; i < n; ++i) {
                String aite = t.substring(i, i + 1);

                if (i - k < 0 || !aiteList.get(i - k).equals(aite) || takahashiList.get(i - k) == 0) {
                    if (aite.equals("r")) {
                        score += p;
                    } else if (aite.equals("s")) {
                        score += r;
                    } else if (aite.equals("p")) {
                        score += s;
                    }
                    takahashiList.add(1);
                } else {
                    takahashiList.add(0);
                }

                aiteList.add(aite);
            }
            System.out.println(score);
        }
    }

}
