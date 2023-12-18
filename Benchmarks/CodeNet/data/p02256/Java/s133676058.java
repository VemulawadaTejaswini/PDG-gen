import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}

