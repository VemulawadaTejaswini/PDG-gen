import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        for (int i =0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }

    }
}
