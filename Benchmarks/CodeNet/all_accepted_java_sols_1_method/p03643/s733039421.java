import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (n > 99) {
            System.out.println("ABC" + n);
        } else {
            System.out.println("ABC0" + n);
        }
    }
}