import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long ret = 0L;
        long count_a = 0L;
        for (char c : new Scanner(System.in).next().replaceAll("BC", "X").toCharArray()) {
            if (c == 'A') {
                count_a++;
            } else if (c == 'X') {
                ret += count_a;
            } else {
                count_a = 0L;
            }
        }
        System.out.println(ret);
    }
}
