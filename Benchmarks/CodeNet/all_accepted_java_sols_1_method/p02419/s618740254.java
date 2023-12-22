import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next().toUpperCase();
        String s = scanner.next();
        int count = 0;
        while (!s.equals("END_OF_TEXT")) {
            s = s.toUpperCase();
            if (s.equals(w)) count++;
            s = scanner.next();
        }
        System.out.println(count);
    }
}
