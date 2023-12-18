import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        long A = Long.parseLong(array[0]);
        long B = Long.parseLong(array[1]);
        //long C = Long.parseLong(array[2]);
        long K = Long.parseLong(array[3]);

        if ((K & 1) == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}