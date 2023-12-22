import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[] s = scanner.next().split("-");
        if (s.length != 2) System.out.println("No");
        else System.out.println(s[0].length() == a && s[1].length() == b ? "Yes":"No");
    }
}
