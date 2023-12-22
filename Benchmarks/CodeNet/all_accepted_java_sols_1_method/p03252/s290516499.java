import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String first = reader.nextLine();
        String second = reader.nextLine();
        System.out.println(first.chars()
                .distinct()
                .mapToLong(a -> first.chars()
                        .filter(el -> el == a)
                        .count())
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .equals(second.chars()
                        .distinct()
                        .mapToLong(a -> second.chars()
                                .filter(el -> el == a)
                                .count())
                        .boxed()
                        .sorted()
                        .collect(Collectors.toList())) ? "Yes" : "No");
    }
}