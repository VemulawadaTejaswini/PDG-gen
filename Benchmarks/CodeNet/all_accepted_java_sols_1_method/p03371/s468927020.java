import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);
        int C = Integer.parseInt(array[2]);
        int X = Integer.parseInt(array[3]);
        int Y = Integer.parseInt(array[4]);
        int c2 = C * 2;

        int min =  A * X + B * Y;

        if (X > Y) {
            min = Math.min(min, c2 * Y + A * (X - Y));
            min = Math.min(min, c2 * X);
        } else if (Y > X) {
            min = Math.min(min, c2 * X + B * (Y - X));
            min = Math.min(min, c2 * Y);
        } else {
            min = Math.min(min, c2 * X);
        }
        System.out.println(min);
    }
}