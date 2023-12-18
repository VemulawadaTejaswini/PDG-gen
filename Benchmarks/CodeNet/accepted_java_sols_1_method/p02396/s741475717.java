import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;
        int x = in.nextInt();

        while (x != 0) {
            System.out.println("Case " + i + ": " + x);
            x = in.nextInt();
            i++;
        }

        System.exit(0);
    }
}

