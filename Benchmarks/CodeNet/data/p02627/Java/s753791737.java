import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            char c = s.next().charAt(0);
            System.out.println('A' <= c && c <= 'Z' ? 'A' : 'a');
        }
    }
}
