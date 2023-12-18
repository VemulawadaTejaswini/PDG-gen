import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int angle = 180 * (N - 2);
        System.out.println(angle);
    }
}