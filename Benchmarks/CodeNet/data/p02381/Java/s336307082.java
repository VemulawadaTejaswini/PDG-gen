import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            ArrayList<Integer> s = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                s.add(scanner.nextInt());
            }
            double m = 0;
            for (int i = 0; i < s.size(); i++) {
                m += s.get(i);
            }
            m /= s.size();

            double x = 0;
            for (int i = 0; i < s.size(); i++) {
                x += (s.get(i) - m) * (s.get(i) - m);
            }
            System.out.println(Math.sqrt(x / s.size()));
        }
        scanner.close();
    }
}

