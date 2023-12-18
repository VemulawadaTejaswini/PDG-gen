import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var kNum = Integer.parseInt(scanner.nextLine());
        var s = scanner.nextLine();
        var sNum = Integer.parseInt(s);

        if (sNum <= kNum) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, kNum) + "...");
        }
    }
}
