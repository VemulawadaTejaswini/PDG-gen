import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        scan.close();

        int max = Math.max(Math.max(a, b), c);

        int remains = 0;
        if (max == a) {
            remains = b + c;
        } else if (max == b) {
            remains = a + c;
        } else {
            remains = a + b;
        }

        int maxResult = max;
        for (int i = 0; i < k; i++) {
            maxResult = maxResult * 2;
        }

        System.out.println(maxResult + remains);

    }
}
