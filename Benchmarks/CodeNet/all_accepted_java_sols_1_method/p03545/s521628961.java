import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 1000;
        int b = (n - a * 1000) / 100;
        int c = (n - a * 1000 - b * 100) / 10;
        int d = n % 10;
        if (a + b + c + d == 7)
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + 7);
        else if (a + b + c - d == 7)
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=" + 7);
        else if (a + b - c + d == 7)
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=" + 7);
        else if (a - b + c + d == 7)
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=" + 7);
        else if (a + b - c - d == 7)
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=" + 7);
        else if (a - b + c - d == 7)
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=" + 7);
        else if (a - b - c + d == 7)
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=" + 7);
        else if (a - b - c - d == 7)
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=" + 7);
    }
}
