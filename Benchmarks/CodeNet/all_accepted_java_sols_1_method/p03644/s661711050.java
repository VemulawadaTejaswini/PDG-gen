import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 2;
        while (n >= total) {
            total *= 2;
        }

        System.out.print(total / 2);
    }
}
