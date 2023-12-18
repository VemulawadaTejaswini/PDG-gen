import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int a = (Y - 2 * X) % 2;

        if (a == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        return;
    }
}
