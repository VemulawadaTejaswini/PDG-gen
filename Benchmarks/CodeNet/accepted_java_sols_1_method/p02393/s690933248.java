import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            }
            else if (a < c) {
                System.out.println(a + " " + c + " " + b);
            }
            else {
                System.out.println(c + " " + a + " " + b);
            }
        }
        else {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            }
            else if (b < c) {
                System.out.println(b + " " + c + " " + a);
            }
            else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
