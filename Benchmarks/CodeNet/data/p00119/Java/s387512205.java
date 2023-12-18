import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (final Scanner scanner = new Scanner(System.in)) {

            final int m = scanner.nextInt();
            final int n = scanner.nextInt();

            final List<List<Integer>> table = new LinkedList<>();
            final List<Integer> pr = new LinkedList<>();

            for (int i = 0; i < m; i++) {
                table.add(new LinkedList<>());
                pr.add(0);
            }

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                x--;
                y--;
                table.get(x).add(y);
                pr.set(y, pr.get(y) + 1);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (pr.get(j) == 0) {
                        System.out.println("" + (j + 1));

                        for (Integer succ : table.get(j)) {
                            pr.set(succ, pr.get(succ) - 1);
                        }

                        pr.set(j, pr.get(j) - 1);
                    }
                }
            }

        }

    }

}

