import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());

        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100 % 10;

        System.out.println(b + c + d);
    }
}