import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int area      = a*b;
        int perimeter = 2*a + 2*b;
        System.out.printf("%d %d\n", area, perimeter);
    }
}