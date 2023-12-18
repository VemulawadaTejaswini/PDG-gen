import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static String[] ANS = { "Three", "Four" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        System.out.println(ANS[set.size() - 3]);
    }
}
