import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> an = new HashMap<>();
        int count = 0;

        for (int i = 1 ; i - 1 < n ; i++) {
            an.put(i, scanner.nextInt());
        }

        for (int i = 1 ; i - 1 < an.size() ; i++) {
            if (i % 2 != 0 && an.get(i) % 2 != 0) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}