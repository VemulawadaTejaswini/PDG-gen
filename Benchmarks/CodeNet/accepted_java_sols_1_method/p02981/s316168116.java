import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = n*a;
        if (b <= c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
    }
}