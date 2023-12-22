import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std  = new Scanner(System.in);
        String s = std.next();
        String[] split = s.split("");
        long count = Arrays.stream(split).distinct().count();
        String rest = s.replaceAll(split[0], "");
        boolean isSame = rest.length() == 2;
        if (count == 2 && isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
