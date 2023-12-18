import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String s = scanner.next();
            if (s.charAt(s.length() - 1) == 's') {
                s += "es";
            } else {
                s += "s";
            }

            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}