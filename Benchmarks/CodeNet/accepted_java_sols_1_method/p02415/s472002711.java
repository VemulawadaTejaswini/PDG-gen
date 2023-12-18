import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = Stream.of(sc.nextLine().split(""))
                .map(s -> s.charAt(0))
                .map(c -> {
                    if (Character.isUpperCase(c)) {
                        return Character.toLowerCase(c);
                    } else {
                        return Character.toUpperCase(c);
                    }
                })
                .map(c -> c.toString())
                .collect(Collectors.joining());
        System.out.println(text);
    }
}


