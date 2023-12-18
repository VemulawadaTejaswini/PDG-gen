import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int bb = (Y - 2 * X);
        System.out.println(bb);
        if (bb % 2 != 0 || bb < 0) {
            System.out.println("No");
        }

        int b = bb / 2;
        int a = X - b;
        System.out.println(a);
        System.out.println(b);

        if (a >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        return;
    }
}
