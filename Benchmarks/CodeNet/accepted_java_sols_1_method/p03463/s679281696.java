import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 2人の間に存在するマス数
        int count = (b - a) - 1;

        if (count % 2 == 0) {
            System.out.println("Borys");
        } else {
            System.out.println("Alice");
        }
    }
}