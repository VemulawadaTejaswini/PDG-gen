import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int l = Integer.parseInt(line);

        double side = (double)l / 3;

        double ans = side * side * side;

        System.out.println(ans);

    }
}