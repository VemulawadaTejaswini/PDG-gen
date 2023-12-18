import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextInt();
            while (scanner.hasNextInt()) {
                List<Integer> integers = new ArrayList<>();
                integers.add(scanner.nextInt());
                integers.add(scanner.nextInt());
                integers.add(scanner.nextInt());
                integers.sort(Integer::compareTo);
                int a = integers.get(0) * integers.get(0);
                int b = integers.get(1) * integers.get(1);
                int c = integers.get(2) * integers.get(2);
                if (c == a + b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}