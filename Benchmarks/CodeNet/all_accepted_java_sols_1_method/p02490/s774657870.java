import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0)
                break;

            System.out.printf("%d %d\n", Math.min(a, b), Math.max(a, b));
        }
    }
}