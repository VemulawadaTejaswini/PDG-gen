import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] c = s.toCharArray();
        Arrays.sort(c);

        if (c[0] == c[1] && c[2] == c[3] && c[1] != c[2]) System.out.println("Yes");
        else System.out.println("No");
    }
}