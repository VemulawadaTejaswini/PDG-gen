import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        if (k % 2 != 0) {
            System.out.println((k + 1) / 2 * ((k + 1) / 2 - 1));
        } else {
            System.out.println(k / 2 * (k / 2));
        }

    }
}




