import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Long> list = new ArrayList<>();
        long result = 0;

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            list.add(a);
            if (i == 0) {
                result = a;
            } else {
                result = result ^ a;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            long a = list.get(i);
            long origin = result ^ a;
            System.out.print(origin);
        }
        System.out.println();

    }
}