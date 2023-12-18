import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int number500 = 0;
        int number5 = 0;
        while (x >= 500) {
            number500++;
            x -= 500;
        }
        while (x >= 5) {
            number5++;
            x -= 5;
        }
        int happy = 1000 * number500 + 5 * number5;
        System.out.println(happy);
    }
}