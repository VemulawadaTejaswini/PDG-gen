import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);

        if (a + b == 15) {
            System.out.println("+");
        } else if (a * b == 15) {
            System.out.println("*");
        } else {
            System.out.println("x");
        }
    }
}