import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a;
        int b;
        int c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a==b && a!=c || a==c && a!=b || b==c && b!=a ) {
            System.out.println("Yes");
        }
        else if ((a+b+c / 3 == a)) {
            System.out.println("No");
        }
        else if (a != b && a != c) {
            System.out.println("No");
        }
        else {
            System.out.println("No");
        }

    }
}