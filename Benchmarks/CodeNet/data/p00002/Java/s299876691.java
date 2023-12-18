import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                integers.add(scanner.nextInt() + scanner.nextInt());
            }
        }
        integers.stream()
        .map(Main::toDigitNumber)
        .forEach(System.out::println);
    }

    private static long toDigitNumber(int n) {
        return Arrays.stream(String.valueOf(n).split("")).count();
    }
}