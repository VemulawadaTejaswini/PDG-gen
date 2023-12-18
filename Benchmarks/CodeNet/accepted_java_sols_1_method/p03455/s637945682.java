import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());

        if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}