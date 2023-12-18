import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder name = new StringBuilder();
        while (n > 0) {
            int lowchar = n % 26;
            name.insert(0, (char) ('a' - 1 + lowchar));
            n = n - lowchar;
            n = n / 26;
        }
        System.out.println(name.toString());
    }
}