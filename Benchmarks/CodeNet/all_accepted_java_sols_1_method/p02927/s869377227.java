import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        for (int i = 1 ; i <= m ;i++) {
            for (int j = 10 ; j <= d ; j++) {
                int d1 = j % 10;
                int d2 = j / 10;
                if (d1 >= 2 && d2 >= 2 && d1 * d2 == i) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}