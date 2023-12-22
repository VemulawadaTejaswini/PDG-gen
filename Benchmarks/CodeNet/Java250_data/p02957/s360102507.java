
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int temp = sc.nextInt() + sc.nextInt();
        if ((int) temp / 2 == (double) temp / 2) {
            System.out.println(temp / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }
        sc.close();
    }
}