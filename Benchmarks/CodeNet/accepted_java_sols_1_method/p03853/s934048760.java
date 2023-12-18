import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int h = Integer.parseInt(split[0]);
        int w = Integer.parseInt(split[1]);

        for (int i = 0; i < h; i++) {
            String s = scanner.nextLine();
            System.out.println(s);
            System.out.println(s);
        }
    }
}
