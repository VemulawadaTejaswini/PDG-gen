import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        if (a <= 8 && b <= 8) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}