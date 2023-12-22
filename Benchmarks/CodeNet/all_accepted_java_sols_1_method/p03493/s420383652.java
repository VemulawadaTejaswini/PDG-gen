import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(
            Integer.parseInt(s.substring(0, 1))
                + Integer.parseInt(s.substring(1, 2))
                + Integer.parseInt(s.substring(2, 3))
        );

    }
}
