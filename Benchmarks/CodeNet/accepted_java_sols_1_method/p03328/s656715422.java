import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        int x = b - a;
        int current = 0, prev = 1;
        for (int i = 2; i <= 999; i++) {
            current = prev + i;
            if (current - prev == x) {
                System.out.println(current - b);
                return;
            }
            prev = current;
        }
    }
}