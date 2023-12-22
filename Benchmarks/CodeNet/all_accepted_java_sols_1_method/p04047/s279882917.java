import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        for (int i = 0; i < n * 2; i++) {
            l.add(Integer.parseInt(scanner.next()));
        }

        l.sort(Integer::compareTo);

        int ans = 0;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                ans += l.get(i);
            }
        }
        System.out.println(ans);
    }
}
