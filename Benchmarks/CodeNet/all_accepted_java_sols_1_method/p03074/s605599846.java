import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String s = scanner.nextLine();

        List<Integer> a = new ArrayList<>();
        a.add(0);

        char current = s.charAt(0);
        for (int i = 1; i < n; i++) {

            if (s.charAt(i) != current) {
                a.add(i);
                current = s.charAt(i);
            }
        }
        a.add(s.length());


        int max = 0;


        for (int i = 0; i < a.size() - 1; i++) {

            int j = s.charAt(a.get(i)) == '0' ? i + 2 * k : i + 2 * k + 1;
            j = Math.min(j, a.size() - 1);

            int x = a.get(j) - a.get(i);

            if (x > max) {
                max = x;
            }
        }

        System.out.println(max);
    }
}