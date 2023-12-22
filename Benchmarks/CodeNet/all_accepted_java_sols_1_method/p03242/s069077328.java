import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String n = sc.next();

        n = n.replaceAll("1", "0");
        n = n.replaceAll("9", "1");
        n = n.replaceAll("0", "9");
        System.out.println(n);
    }
}
