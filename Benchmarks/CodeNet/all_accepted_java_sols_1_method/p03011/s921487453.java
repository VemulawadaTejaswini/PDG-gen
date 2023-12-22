import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int p = stdIn.nextInt();
        int q = stdIn.nextInt();
        int r = stdIn.nextInt();

        int min = p + q;
        if (p + r < min) {
            min = p + r;
        }
        if (q + r < min) {
            min = q + r;
        }

        System.out.println(min);
    }
}