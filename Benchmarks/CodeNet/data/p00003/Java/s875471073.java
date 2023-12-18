import java.util.Scanner;

class Main {
    private void rightTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a * a + b * b - c * c == 0 ||
                b * b + c * c - a * a == 0 ||
                c * c + a * a - b * b == 0)
                System.out.println("YES");
            else
                System.out.println("No");
        }
    }

    public static void main(String[] args) {
        (new Main()).rightTriangle();
    }
}