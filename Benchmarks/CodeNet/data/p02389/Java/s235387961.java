import java.util.Scanner;

class Main {
    public static void main(String...args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println( (a * b) + " " + ((a + b) * 2));
    }
}