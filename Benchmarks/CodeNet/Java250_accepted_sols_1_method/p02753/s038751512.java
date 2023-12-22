import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] station = s.toCharArray();

        if (station[0] == 'A' & station[1] == 'A' & station[2] == 'A') {
            System.out.println("No");
        } else if (station[0] == 'B' & station[1] == 'B' & station[2] == 'B') {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}