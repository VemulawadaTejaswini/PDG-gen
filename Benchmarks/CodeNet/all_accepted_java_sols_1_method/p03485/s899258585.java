import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int amaru = (a + b) % 2;
        if (amaru == 0) {
            System.out.println((a + b) / 2);
        } else {
            System.out.println((a + b) / 2 + 1);
        }
    }
}