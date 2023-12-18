import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        int k;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            k = sc.nextInt();
        }
        if (k == 1) {
            System.out.println(0);
            return;
        }
        System.out.println(n -k);
    }
}
