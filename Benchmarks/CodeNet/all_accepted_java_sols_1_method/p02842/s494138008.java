import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = (int) (n / 1.08);
        if (n == x * 1.08) {
            System.out.println(x);
        } else {
            x++;
            System.out.println(n == (int) (x * 1.08) ? x : ":(");
        }
    }
}
