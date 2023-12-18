import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[]$) {
        String s = new Scanner(System.in).next();
        IntStream.rangeClosed('a', 'z').map(c -> Arrays.stream(s.split(String.valueOf((char)c), -1)).mapToInt(String::length).max().getAsInt()).min().ifPresent(System.out::println);
    }
}