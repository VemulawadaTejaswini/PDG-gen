import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if ((a <= c && b >= c) || (a >= c && b <= c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}