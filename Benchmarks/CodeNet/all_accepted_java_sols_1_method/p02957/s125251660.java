import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int wa = a + b;
        sc.close();
        if (wa % 2 == 0) {
            System.out.println(wa / 2);
            return;
        } else {
            System.out.println("IMPOSSIBLE");
            return;
        }

    }
}
