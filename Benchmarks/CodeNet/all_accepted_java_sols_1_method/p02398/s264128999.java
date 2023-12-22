import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int sum = 0;

        while (a <= b) {
            if (c % a == 0) {
                sum++;
            }
            a++;
        }

        System.out.println(sum);
    }
}