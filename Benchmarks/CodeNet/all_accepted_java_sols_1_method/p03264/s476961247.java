import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 2;
        int c;
        if (a % 2 == 0) {
            c = b;
        } else {
            c = b + 1;
        }
        System.out.println(b * c);
    }
}