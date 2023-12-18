import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            ArrayList<Integer> scores = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                scores.add(sc.nextInt());
            }
            scores.sort(Comparator.naturalOrder());
            double average = 0;
            for (int i = 1; i < scores.size() - 1; i++) {
                average += scores.get(i);
            }
            average /= (scores.size() - 2);
            System.out.println((int)Math.floor(average));
        }
        sc.close();
    }
}

