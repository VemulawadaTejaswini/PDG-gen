import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int comfortable = 0;
        ArrayList<Long> an = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            an.add(scanner.nextLong());
        }
        an.sort((o1, o2) -> (int) (o2 - o1));

        for (int i = 0; i < an.size() - 1; i++) {
            long a = an.get(i);
            comfortable = Math.toIntExact(comfortable + a);
        }
        System.out.println(comfortable);
    }
}