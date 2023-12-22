import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int m = a * b;
        int s = 2 * a + 2 * b;
        System.out.println(m + " " + s);
    }
}