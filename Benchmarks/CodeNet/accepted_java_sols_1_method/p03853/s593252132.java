import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());
        scanner.nextLine();

        String[] C = new String[H];
        for (int i = 0; i < H; i++) {
            C[i] = scanner.nextLine();
        }
        scanner.close();

        for (String c : C) {
            System.out.println(c);
            System.out.println(c);
        }
    }
}
