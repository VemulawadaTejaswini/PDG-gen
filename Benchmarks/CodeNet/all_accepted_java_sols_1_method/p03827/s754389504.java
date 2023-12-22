import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int c = 0;
        int max = 0;
        for (char ch : scanner.next().toCharArray()) {
            if (ch == 'I') {
                max = Math.max(max, ++c);
            } else {
                c--;
            }
        }
        System.out.println(max);
    }
}