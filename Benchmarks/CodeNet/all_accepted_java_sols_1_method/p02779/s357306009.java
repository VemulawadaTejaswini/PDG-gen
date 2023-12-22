import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long count = Integer.parseInt(values[0]);
        ArrayList<Long> l1 = new ArrayList<>();
        line = scanner.nextLine();
        values = line.split(" ");
        for (int i = 0; i < count; i++) {
            l1.add(Long.valueOf(values[i]));
        }
        HashSet<Long> s1 = new HashSet<>(l1);
        if (l1.size() == s1.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}