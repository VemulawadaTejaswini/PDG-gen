import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(CalculateGCD(x, y));
        sc.close();
    }

    public static int CalculateGCD(int x, int y) {
        if (x < y) {
            int temp;
            temp = x;
            x = y;
            y = temp;
        }
        if (x % y == 0) {
            return y;
        } else {
            return CalculateGCD(y, x % y);
        }
    }
}
