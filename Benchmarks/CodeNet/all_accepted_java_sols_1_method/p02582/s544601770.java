import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        long count = s.chars().filter(c -> c == 'R').count();
        if (count == 2) {
            if (s.charAt(1) == 'S') {
                count = 1;
            }
        }
        System.out.println(count);
    }
}
