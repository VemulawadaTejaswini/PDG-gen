import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String YES = "Yes";
        String NO = "NO";

        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if(Y%2 != 0) {
            System.out.println(NO);
            return;
        }
        int temp = Y - 2 * X;
        if(temp < 0) {
            System.out.println(NO);
            return;
        }
        int turtle = temp/2;
        if(turtle > X) {
            System.out.println(NO);
            return;
        }
        System.out.println(YES);
    }
}