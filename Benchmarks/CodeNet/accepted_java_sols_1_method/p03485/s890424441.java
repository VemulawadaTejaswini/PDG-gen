import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt(), b = sc.nextInt();
        if ((a + b) % 2 == 0) {
            System.out.println((a + b) / 2);
        } else {
            System.out.println((a + b) / 2 + 1);
        }
    }
}