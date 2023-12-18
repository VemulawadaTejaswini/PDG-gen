import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String str = Stream.of(scanner.nextLine().split(" "))
                .mapToInt(Integer::valueOf)
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(str);
    }
}