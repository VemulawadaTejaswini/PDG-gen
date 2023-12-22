import java.util.Scanner;

/**
 * ABC042A
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count_5 = 0;
        int count_7 = 0;

        for (int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if (5 == num) {
                count_5++;
            } else if (7 == num) {
                count_7++;
            }
        }

        if (count_5 == 2 && count_7 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}