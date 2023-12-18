import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int min = 10;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            if (a % 10 != 0 && a % 10 < min) {
                min = a % 10;
            }
            result += Math.ceil((double) a / 10) * 10;
        }
        sc.close();
        if (min != 10) {
            result -= 10 - min;
        }
        System.out.println(result);
    }
}