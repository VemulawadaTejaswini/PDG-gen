import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder target = new StringBuilder(scanner.next());
        target.setCharAt(3,'8');

        System.out.println(target);
    }
}
