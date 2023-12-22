import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>() {{
            add('A');
            add('T');
            add('G');
            add('C');
        }};
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int len = 0, max = 0;
        for (char c : s.toCharArray()) {
            len = list.contains(c) ? (len + 1) : 0;
            max = max < len ? len : max;
        }
        System.out.println(max);
    }
}