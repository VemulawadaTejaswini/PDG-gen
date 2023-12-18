import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int[] array = { a, b, c };

        for (int i : array) {
            if (i < 0 || i > 10000) {
                System.exit(0);
            }
        }

        int stock = 0;

        if (array[0] > array[1]) {
            stock = array[0];
            array[0] = array[1];
            array[1] = stock;
        }

        if (array[1] > array[2]) {
            stock = array[2];
            array[2] = array[1];
            array[1] = stock;
        }

        if (array[0] > array[1]) {
            stock = array[0];
            array[0] = array[1];
            array[1] = stock;
        }

        System.out.print(array[0] + " " + array[1] + " " + array[2]);

    }

}

