import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int x = cin.nextInt();
        if (x < a || x > a + b) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
