import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if (x < a || x > a + b)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}