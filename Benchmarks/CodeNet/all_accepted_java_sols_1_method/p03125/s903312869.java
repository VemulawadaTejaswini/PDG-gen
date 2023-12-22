import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result;

        if (y % x == 0) {
            result = x + y;
        } else {
            result = y - x;
        }

        System.out.println(result);

    }

}