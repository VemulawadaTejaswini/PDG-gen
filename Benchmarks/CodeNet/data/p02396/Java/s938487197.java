import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int x;

        x = sc.nextInt();

        while (x != 0) {
            System.out.printf("Case %d: %d", ++i, x);
            x = sc.nextInt();
        }
    }
}
