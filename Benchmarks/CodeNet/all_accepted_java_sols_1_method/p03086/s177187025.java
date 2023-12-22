
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String line = sc.nextLine();
        Set<Character> target = new HashSet<>();
        target.add('A');
        target.add('C');
        target.add('G');
        target.add('T');
        int count = 0;
        int result = 0;
        for (char c : line.toCharArray()) {
            if (target.contains(c)) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        result = Math.max(result, count);
        System.out.println(result);
    }
}
