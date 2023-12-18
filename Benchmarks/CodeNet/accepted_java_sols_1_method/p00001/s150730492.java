import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            }
        }
        integers.sort(Comparator.reverseOrder());
        integers.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}