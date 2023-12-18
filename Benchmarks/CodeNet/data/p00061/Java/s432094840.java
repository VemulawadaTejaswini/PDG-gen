import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Data {
    final int id;
    final int solved;
    int rank = 0;
    public Data(int id, int solved) {
        this.id = id;
        this.solved = solved;
    }
}

class Main {
    private static void solve() {
        final Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s]+");

        final List<Data> result = new ArrayList<Data>();
        while (true) {
            final int id = scanner.nextInt();
            final int solved = scanner.nextInt();
            if (id == 0 && solved == 0) {
                break;
            }
            result.add(new Data(id, solved));
        }
        Collections.sort(result, new Comparator<Data>() {
            public int compare(Data o1, Data o2) {
                return o1.solved == o2.solved ? 0 : (o1.solved > o2.solved ? -1 : 1);
            }
        });
        int rank = 0;
        int solved = 0;
        for (Data data: result) {
            if (data.solved != solved) {
                rank++;
                solved = data.solved;
            }
            data.rank = rank;
        }
        Collections.sort(result, new Comparator<Data>() {
            public int compare(Data o1, Data o2) {
                return o1.id == o2.id ? 0 : (o1.id > o2.id ? 1 : -1);
            }
        });
        while (scanner.hasNextInt()) {
            System.out.println(result.get(scanner.nextInt() - 1).rank);
        }
    }

    public static void main(String... args) {
        solve();
    }
}